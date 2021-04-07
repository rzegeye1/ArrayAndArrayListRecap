import java.util.ArrayList;

public class ArrayListPractice {

    // its resizable
    // it hold object
    // inherit from list

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);

    }

    public void printGroceryList() {

        System.out.println("The total number of item you have entered = " + groceryList.size());

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ", " + groceryList.get(i));
        }
    }

    public void removeGroceryItem(int position) {
        groceryList.remove(position);

    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item" + (position + 1) + "has been modified");

    }

    public String findItem(String searchItem) {
        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;

    }

}

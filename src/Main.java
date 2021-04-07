import java.util.Scanner;

public class Main {


    private static ArrayListPractice groceryList = new ArrayListPractice();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] arg) {


        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.println("Please choose the number: ");
            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }
    }

    public static void printInstruction() {

        System.out.println("press");
        System.out.println("0 - To print choice options.");
        System.out.println("1 - To print the list of grocery items");
        System.out.println("2 - To add an item to the list.");
        System.out.println("3 - To modify an item in the list");
        System.out.println("4 - To remove an item from the list");
        System.out.println("5 - To search an item from the list");
        System.out.println("6 - To quit the application");

    }

    public static void addItem() {
        System.out.println("please enter the grocery item");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("please enter item number");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("please enter replacement item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo - 1, newItem);

    }

    public static void removeItem() {
        System.out.println("please enter item number");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo - 1);
    }

    public static void searchForItem() {
        System.out.println("please enter the item to search for");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found search item in the grocery list");
        } else {
            System.out.println(searchItem + " not found in the grocery list");
        }

    }


}



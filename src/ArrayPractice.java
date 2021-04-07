import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.checkedCollection;
import static java.util.Collections.reverseOrder;

public class ArrayPractice {

    //    private static Scanner scan = new Scanner(System.in);
    //
    //
    //    public static int[] getIntegers(int number) {
    //
    //        int myArray[] = new int[number];
    //
    //        System.out.println("please enter "+number+ " numbers");
    //
    //          for(int i = 0; i<myArray.length; i++){
    //              myArray[i]= scan.nextInt();
    //          }
    //return myArray;
    //    }
    //
    //    public static int sumOfArray(int []myArray){
    //
    //        int sum = 0;
    //        for (int i = 0; i<myArray.length; i++){
    //            sum += myArray[i];
    //        }
    //        return sum;
    private static Scanner scan = new Scanner(System.in);

    public static int[] getIntegers(int number) {

        System.out.println("please enter " + number + " numbers");


        int[] numberEntered = new int[number];
        for (int i = 0; i < numberEntered.length; i++) {
            numberEntered[i] = scan.nextInt();
        }
        return numberEntered;
    }


    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("The number you have entered is " + array[i]);

        }

    }


 

 

 
 
 


}



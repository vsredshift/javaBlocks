import MultiDimensionalArrays.MonthlyTemperatures;

import javax.naming.CannotProceedException;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        temperature();
//        System.out.println(max(testArray));
//        System.out.println(sum(testArray));
//        someUsefulArrayMethods();
        MonthlyTemperatures.monthlyTemperatures();
    }

    // Test Array
    static int[] testArray = {23, 43, 1213, 23, 56, -1, 432};


    // _________________TEMPERATURE____________________________

    // temperature method
    static void temperature() {
        double[] temperature;
        temperature = enterTemps();
        displayTemps(temperature); // call method with a single array
    }

    static double[] enterTemps() {
        Scanner keyboard = new Scanner(System.in);
        double[] temperatureOut = new double[7];
        for (int i = 0; i < temperatureOut.length; i++) {
            System.out.println("Enter temperature for day " + (i + 1));
            temperatureOut[i] = keyboard.nextDouble();
        }
        return temperatureOut;
    }

    // method to display temperatures using varargs
    static void displayTemps(double[] temperatureIn) {
        System.out.println();
        System.out.println("***TEMPERATURES***");
        System.out.println("Number of temperatures: " + temperatureIn.length); // count items
        // display temperatures
        for (int i = 0; i < temperatureIn.length; i++) {
            System.out.println(temperatureIn[i] + " ");
        }
    }


    //____________________USEFUL METHODS_________________________________________
    static void someUsefulArrayMethods() {
        char choice;
        Scanner keyboard = new Scanner(System.in);
        int[] someArray; // declare an integer array
        System.out.print("How many elements to store?: ");
        int size = keyboard.nextInt();
        // size the array
        someArray = new int[size];
        // menu
        do {
            System.out.println();
            System.out.println("[1] Enter values");
            System.out.println("[2] Find maximum");
            System.out.println("[3] Calculate sum");
            System.out.println("[4] Check membership");
            System.out.println("[5] Search array");
            System.out.println("[6] Display values");
            System.out.println("[7] Exit");
            System.out.print("Enter choice [1-7]: ");
            choice = keyboard.next().charAt(0);
            System.out.println();
            // process choice by calling additional methods
            switch (choice) {
                case '1':
                    fillArray(someArray);
                    break;

                case '2':
                    int max = max(someArray);
                    System.out.println("Maximum array value = " + max);
                    break;

                case '3':
                    int total = sum(someArray);
                    System.out.println("Sum of array values = " + total);
                    break;

                case '4':
                    System.out.print("Enter value to find: ");
                    int value = keyboard.nextInt();
                    boolean found = contains(someArray, value);
                    if (found) {
                        System.out.println(value + " is in the array");
                    } else {
                        System.out.println(value + " is not in the array");
                    }
                    break;

                case '5':
                    System.out.print("Enter value to find: ");
                    int item = keyboard.nextInt();
                    int index = search(someArray, item);
                    if (index == -999) { // indicates value not found
                        System.out.println("This value is not in the array");
                    } else {
                        System.out.println("This value is at array index " + index);
                    }
                    break;

                case '6':
                    System.out.println("Array values");
                    displayArray(someArray);
                    break;
            }

        } while (choice != '7');
        System.out.println("Goodbye");
    }


    // additional methods

    // fills an array with values
    static void fillArray(int[] arrayIn) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < arrayIn.length; i++) {
            System.out.print("enter value ");
            arrayIn[i] = keyboard.nextInt();
        }
    }


    // max number in array
    static int max(int[] arrayIn) {
        int result = arrayIn[0];  // set result to first value
        for (int i = 1; i < arrayIn.length; i++) {
            if (arrayIn[i] > result) {
                result = arrayIn[i];
            }
        }
        return result;
    }


    // summing over array
    static int sum(int[] arrayIn) {
        int total = 0;
        for (int currentElement : arrayIn) {  // enhanced for loop
            total = total + currentElement;
        }
        return total;
    }


    // Test for Array Membership
    static boolean contains(int[] arrayIn, int valueIn) {
        for (int currentElement : arrayIn) {
            if (currentElement == valueIn) {
                return true;
            }
        }
        return false;
    }


    // Display values in array
    static void displayArray(int[] arrayIn) {
        System.out.println();
        for (int i = 0; i < arrayIn.length; i++) {
            System.out.println("array[" + i + "] =" + arrayIn[i]);
        }
    }


    // Search array
    static int search(int[] arrayIn, int valueIn) {
        for (int i = 0; i < arrayIn.length; i++) {
            if (arrayIn[i] == valueIn) {
                return i;
            }
        }
        return -999;
    }

}
        //________________________ Multi-dimensional Arrays __________________________


package Bubble;

import java.util.*;

/*
Question 1: Create public class BubbleArray, add Array variable to the main function.
In the custom function, use bubble sort to sort the array of numbers in ascending order.
Call your custom function to main and print the output to main method.
 */

public class BubbleArray {

    public static void main(String[] args) {

        int[] Numbers = {34, 2, 10, 6, 7, 5, 1, 5};


        MyArray(Numbers);   //sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");

        for(int i=0; i < Numbers.length; i++){
            System.out.print(Numbers[i] + " ");
        }
        System.out.println();

            userArrayFound();

        }




    public static void MyArray(int arr []) {

        int len = arr.length;

        for (int i = 0; i < (len - 1); i++) {
            for (int j = 0; j < (len - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }


    /*
Question 2:
 Using the scanner utility, prompt input from user.
 Write another code for the number of times a number occurs in the array, based on user input.
 Create a boolean and assign a variable found, this boolean should hold false.
 Run the if and else statements, for that code.
 Print output, of number and how many times it occurs.
 Call custom function to main function.

     */



            public static int userArrayFound () {

            int[] Numbers = {34, 2, 10, 6, 7, 5, 1, 5};

            int a = Numbers.length;
            int count = 0;
            boolean found = false;

            System.out.println("Enter a number: ");
            Scanner userInput = new Scanner(System.in);
            int userNumber = userInput.nextInt();

            for (int i = 0; i < a; i++) {
                if (Numbers[i] == userNumber)
                    count++;
            }


            for (int n : Numbers) {
                if (n == userNumber) {
                    found = true;
                    break;
                }
            }
            if (found) {

                System.out.println("We found" + " " + count + "  " + "counts of " + " " + userNumber);

            } else System.out.println(userNumber + " " + " " + "not found!");


            return userArrayFound(); //return method to keep prompting for user input
            // otherwise return 1 to terminate program after first user input.

        }


    }
























































































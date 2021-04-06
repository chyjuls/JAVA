package BubbleSort;
import java.util.*;


/*
Question 1: Custom function created to hold the code for sorting the ages in ascending order using bubble sort.
This was called to main function, and the output from the main function.
Question 2: Custom function created with different variables from different function. To execute this code,
function was called to main function and the for iteration was used to extract the elements between 30 and 40.
This can also be done by using a java inbuilt function Arrays.copyOFRange.
 */
public class Ages {

    public static void main(String[] args) {

        int[] Ages = {17, 21, 97, 66, 55, 30, 33, 45, 58, 67, 38, 39, 41, 19, 23};
        int len = Ages.length;

        CustomerAges(Ages); // calling your functions/methods into main.
        System.out.println("Customers ages are in the order below:\n");
        for (int i = 0; i < len; i++) {
            System.out.print(Ages[i] + " ");
        }
        System.out.println();


        System.out.println("\n" + "These are the ages between 30 and 40 in the sorted array:\n");

        AgeRange(Ages);
        for (int k = 4; k < (len-7); k++) {
            System.out.print(Ages[k]+ " ");

        }
    }


    public static void CustomerAges(int[] Customers) {

        int a = Customers.length;


        for (int i = 0; i < a - 1; i++) {
            for (int j = 0; j < a - 1; j++) {
                if (Customers[j] > Customers[j + 1]) {

                    int temp = Customers[j];
                    Customers[j] = Customers[j + 1];
                    Customers[j + 1] = temp;
                }
            }
        }
        }


        public static void AgeRange(int [] MyRange) {

            int len =MyRange.length;


            for (int i = 0; i < (len - 1); i++) {
                for (int j = 0; j < (len - 1); j++) {
                    if (MyRange[j] > MyRange[j + 1]) {

                        int temp = MyRange[j];
                        MyRange[j] = MyRange[j + 1];
                        MyRange[j + 1] = temp;
                    }

                }

            }




                    }

        }

// End of code...





























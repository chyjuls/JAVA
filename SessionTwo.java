package numbers;
import java.util.*;
// Create class  from src folder and save it.

public class SessionTwo {

    public static void main(String[] args) {
        inputNumbers();

// Calling custom function in main.
    }
// Define your function and create variables by prompting user input.


     public static void  inputNumbers() // Using the scanner utility prompt user for input.
     {
         Scanner userInput = new Scanner(System.in);

         System.out.println("Please enter a number: ");

         int number = userInput.nextInt();

// Print result and multiply by 3.

         System.out.println("The number you entered is: " + number + "\n Triple" + " " + number + "\n is:\n" + number * 3 );


     }

}

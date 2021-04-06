package src;
import java.util.*;

// Create a class from the src folder, and name it'

public class SessionOne
{
    public static void main(String[] args)
    {
        inputName();
        inputSurname();

// calling custom functions in main.

}
// Define a function inputName.

    public static void inputName()
    {
        Scanner userInput = new Scanner(System.in); // Ask user to input name using java.utility scanner.

        System.out.println("Please enter your name: ");

        String name = userInput.nextLine();

        System.out.println("Your name is \n"  + name + ".");

    }
    // Define the second function inputSurname.
    // Repeat same as in fist custom function.

        public static void inputSurname()
    {

            Scanner userInputSurname = new Scanner(System.in);

            System.out.println("Please enter your surname:");

            String surname = userInputSurname.nextLine();

            System.out.println("Your surname is \n" + surname +".");


        }

    }

// End of code*






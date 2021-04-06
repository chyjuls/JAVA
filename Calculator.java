
package calculate;
import java.util.*;
// create class (Calculator) from the src folder using alt + insert, on Windows keyboard.

public class Calculator {
    // Define main function.

    public static void main(String[] args) {
        myCalculator(); // calling custom function in main.
    }

    // define custom function myCalculator.

      public static void myCalculator() {
// create variables store them in user input using scanner utility.

          Scanner userInput = new Scanner(System.in);
          System.out.println("Please enter first number");
          double x = userInput.nextDouble();
          System.out.println("Please enter second number");
          double y = userInput.nextDouble();
          System.out.println("Please enter any of this operators:  (+,-,/,*,%)");
          char operator = userInput.next().charAt(0);

           double result;

           // Run the switch statement using operator as the expression.

          switch (operator) {
              case ('+'):
                  result = x + y;
                  break;
              case ('-'):
                  result = x - y;
                  break;
              case ('*'):
                  result = x * y;
                  break;
              case ('/'):
                  result = x / y;
                  break;
              case ('%'):
                  result = x % y;
                  break;

              default: // returns an error if invalid operator used.

                  System.out.println("Error! You have entered an invalid operator..");
                  return;
          }
          System.out.println(x + " " + operator + " " + y + " = " + result);

      }



}


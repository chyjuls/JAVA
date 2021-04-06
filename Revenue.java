package Arrays;
import java.util.*;

public class Revenue {
    public static void main(String [] args){

        RevenueArray();

    }
    // create a custom method RevenueArray


    public static void RevenueArray(){

// Store array in a variable called revenue, use double as data type.

        double [] revenue = {150.00, 200.00, 154.98, 335.01, 475.12, 555.87, 216.38};
        double len = revenue.length;

// use the selection algorithm to get the maximum value.

        for (int i = 0; i < len - 1; i++) {


            int max_index = i;

            for (int j = i + 1; j < len; j++)
                if (revenue[max_index] < revenue[j])
                    max_index = j;

            double temp = revenue[max_index];
            revenue[max_index] = revenue[i];
            revenue[i] = temp;


        }
        System.out.println("The largest value is " +  "£"+ revenue[0]);




                }




    }
// End of code.

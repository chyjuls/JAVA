package EmailApp;
import java.util.*;

public class Email {

    public static void main(String [] args){
        App myEmail = new App("Chichi","Okpara","sales","procurement.com");
        App myEmail1 = new App("Mark","Curry","marketing","procurement.com");
        App MyPassword = new App("");
        App MyPassword1 =new App("");

        System.out.println("Your email address is\n" + myEmail.FirstName.toLowerCase() + myEmail.LastName.toLowerCase() + "@"+ myEmail.Department + myEmail.EmailPrefix);

        System.out.println("and your password is\n" + MyPassword.PasswordSet);
        System.out.println();

        System.out.println(myEmail1.FirstName + " "+ myEmail1.LastName + "'s" + " " + "email address is \n" + myEmail1.FirstName.toLowerCase() + myEmail1.LastName.toLowerCase()
        + "@" + myEmail1.Department+myEmail1.EmailPrefix + " " + " password is\n" + "\n" + MyPassword1.PasswordSet);



    }

}

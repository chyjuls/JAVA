// A project that generates email address and password for a user using classes,
// objects and constructors.

package EmailApp;
import java.util.*;

public class App {
    String FirstName;
    String LastName;
    String Department;
    String EmailPrefix;
    String PasswordSet;
    int PasswordLength = 10;


// Constructor code*

    public App(String firstname, String lastname, String Department, String EmailPrefix){
        this.FirstName = firstname;
        this.LastName  = lastname;
        this.Department = Department;
        this.EmailPrefix = EmailPrefix;

    }
    // New constructor for the password. As this will be generated after the email.

    public App (String PasswordSet){
        this.PasswordSet = GeneratedPassword(PasswordLength);


    }
    // This code is to generate a random password 10 characters long.
    // The Math.random() is used to make sure the characters are generated for # number of characters, in the String MyPassword.
    //

    public static String GeneratedPassword(int length) {
        String MyPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890#$%&@";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * MyPassword.length());
            password[i] = MyPassword.charAt(rand);

        }
        return new String(password);
    }
}


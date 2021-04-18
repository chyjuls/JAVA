package PasswordGeneratorApp;
import java.util.*;
// Generate a password with maximum length of 10 characters.
public class PasswordGenerator {
    public static void main(String [] args){
        int PasswordsLength = 10;
        MyPassword(10);
        System.out.println(MyPassword(10));



    }
// Generating a random password by iterating through the length of the characters in the String Password.

    public static String MyPassword(int length){
        String Password = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@$£%&";
        char [] password = new char[length];
        for(int i = 0; i < length; i ++){
            int rand = (int) (Math.random() * Password.length());
            password[i] = Password.charAt(rand);
        }
        return new String(password);

    }
}

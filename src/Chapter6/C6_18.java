package Chapter6;

import java.util.Scanner;

/**
 * program to check if a password is valid
 *
 * @author LindsayEdgeman
 */
public class C6_18 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Password: ");
        String password = input.next();
        int counter = 0;

        Characters(password, counter);
        lettersDigits(password, counter);
        digits(password, counter);
        if (counter > 2) {
            System.out.println("Password valid.");
        }
        if (counter <= 2) {
            System.out.println("Invalid password try again.");
        }

    }

    /**
     * Characters method
     *
     * @param password
     * @param counter
     */
    public static void Characters(String password, int counter) {
        if (password.length() >= 8) {
            counter++;
        } else {
            System.out.println("A password must have at least eight characters");
        }
    }

    /**
     * lettersDigits method
     *
     * @param password
     * @param counter
     */
    public static void lettersDigits(String password, int counter) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetterOrDigit(password.charAt(i))) {
                counter++;
            } else {
                System.out.println("A password must consist of only letters and digits");
            }
        }
    }

    /**
     * digits method
     *
     * @param password
     * @param counter
     */
    public static void digits(String password, int counter) {
        for (int i = 0; i < password.length(); i++) {

            if (Character.isDigit(password.charAt(i))) {
                counter++;
            }
        }

    }

}

package Chapter4;

import java.util.Scanner;

/**
 * program to determine if string 1 is a substring of string 2
 *
 * @author Lindsay Edgeman
 */
public class C4_22 {

    /**
     * Main method
     *
     * @param args arguments from the command prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string s1: ");
        System.out.println("Enter string s2: ");
        String string1 = input.next();
        String string2 = input.next();

        // Checks if string one has string 2
        if (string1.contains(string2)) {
            System.out.println(string2 + " is a substring of " + string1);
        } else {
            System.out.println(string2 + "Is not a substring of " + string1);
        }

    }

}

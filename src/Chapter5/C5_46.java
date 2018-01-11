package Chapter5;

import java.util.Scanner;

/**
 * Program reverses the string inputed by user
 *
 * @author LindsayEdgeman
 */
public class C5_46 {

    /**
     * Main method
     *
     * @param args arguments from the command line prompt.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String s = input.nextLine();
        System.out.println("The reversed string is " + new StringBuffer(s).reverse().toString());

    }

}

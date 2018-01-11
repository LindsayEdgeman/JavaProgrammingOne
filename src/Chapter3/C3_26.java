package Chapter3;

import java.util.Scanner;

/**
 * Program Checks to see if certain numbers are divisible by 5 and 6
 *
 * @author Lindsay Edgeman
 */
public class C3_26 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int num1 = input.nextInt();

        boolean isNum1
                = (num1 % 5 == 0 && num1 % 6 != 0) || (num1 % 5 != 0 && num1 % 6 == 0);

        boolean isNum2
                = (num1 % 5 == 0 && num1 % 6 == 0);

        boolean isNum3
                = (num1 % 5 == 0) || (num1 % 6 == 0);

        System.out.println("is " + num1 + " divisible by 5 and 6? " + isNum2);
        System.out.println("is " + num1 + " divisible by 5 or 6? " + isNum3);
        System.out.println("is " + num1 + " divisible by 5 or 6, but not both? " + isNum1);

    }

}

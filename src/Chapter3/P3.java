package Chapter3;

import java.util.Scanner;

/**
 * program to see if one number is greater than the other
 *
 * @author Lindsay Edgeman
 */
public class P3 {

    /**
     * Main method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter another number: ");
        double num2 = input.nextDouble();

        if (num1 < num2) {
            System.out.println("The first number is less than the second");
        }

        if (num1 > num2) {
            System.out.println("The first number is greater than the second");
        }

        if (num1 == num2) {
            System.out.println("The first number is equal to the second");
        }

        if (num2 >= num1) {
            System.out.println("The first number is less than or equal to the second");
        }

        if (num1 != num2) {
            System.out.println("The first number is not equal to the second");
        }

        if (num2 == 0) {
            System.out.println("The second number cannot divide by zero.");
        } else if (num1 / num2 < 1) {
            System.out.println("Proper fraction.");
        } else {
            System.out.println("Improper fraction.");
        }

        if (num1 >= 90 && num1 <= 100) {
            System.out.println("A");
        } else if (num1 >= 80 && num1 <= 89) {
            System.out.println("B");
        } else if (num1 >= 70 && num1 <= 79) {
            System.out.println("C");
        } else if (num1 >= 60 && num1 <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (num2 > 1 && num2 <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}

package Chapter2;

import java.util.Scanner;

/**
 * Program to find sales tax / gratuity
 *
 * @author Lindsay Edgeman
 */
public class C2_5 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Subtotal: ");
        double subtotal = input.nextDouble();

        System.out.print("Enter a gratuity: ");
        double gratuity = input.nextDouble();

        double tip = (gratuity / 100) * subtotal;
        double total = subtotal + tip;

        System.out.println("The gratuity is $ " + tip + " The total is $ " + total);

    }

}

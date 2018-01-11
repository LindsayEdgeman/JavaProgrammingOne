package Chapter2;

import java.util.Scanner;

/**
 * Program to find the total of a meal
 *
 * @author Lindsay Edgeman
 */
public class P2 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter meal price: ");
        double meal = input.nextDouble();

        System.out.print("Enter drink price: ");
        double drink = input.nextDouble();

        System.out.print("Enter dessert price: ");
        double dessert = input.nextDouble();

        double total = meal + drink + dessert;
        double totalTax = total * 0.10;
        double totalTip = (totalTax + total) * 0.15;
        double grandTotal = totalTax + totalTip + total;

        System.out.println(" The food is $ " + total + " The tax is $ " + totalTax
                + " The tip is $ " + totalTip + " The grand total is $ " + grandTotal);
    }
}

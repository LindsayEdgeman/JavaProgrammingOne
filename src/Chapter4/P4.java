package Chapter4;

import java.util.Scanner;

/**
 * program figures which bidder wins by comparing work hours and Charge/hour
 *
 * @author Lindsay Edgeman
 */
public class P4 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of first bidder: ");
        String bidder1 = input.next();
// Finding out bidder information
        System.out.println("Enter number of work hours " + bidder1 + " will require: ");
        int workHours1 = input.nextInt();

        System.out.println("How much does " + bidder1 + " charge per hour?: ");
        double charge1 = input.nextDouble();

        System.out.println("Enter name of second bidder: ");
        String bidder2 = input.next();

        System.out.println("Enter number of work hours " + bidder2 + " will require: ");
        int workHours2 = input.nextInt();

        System.out.println("How much does " + bidder2 + " charge per hour?: ");
        double charge2 = input.nextDouble();

        double firstCost = workHours1 * charge1;
        double secCost = workHours2 * charge2;
//if statements finding the comparisons
        if (firstCost < secCost) {
            System.out.printf("The winner is %s", bidder1);
            System.out.printf("Total cost is $%.2f", firstCost);
        }
        if (secCost < firstCost) {
            System.out.printf("The winner is %s", bidder2);
            System.out.printf("\n Total cost is $%.2f", secCost);

        }

        if (secCost == firstCost && workHours1 < workHours2) {
            System.out.printf("The winner is %s", bidder1);
            System.out.printf("\n Total cost is $%.2f", firstCost);
            System.out.printf("\n Total hours %d", workHours1);
        }

        if (secCost == firstCost && workHours2 < workHours1) {
            System.out.printf("The winner is %s", bidder2);
            System.out.printf("\n Total cost is $%.2f", secCost);
            System.out.printf("\n Total hours %d", workHours2);
        }

        if (secCost == firstCost && workHours1 == workHours2) {
            System.out.printf("%s and %s have equal bids", bidder1, bidder2);
            System.out.printf("\n %s: \n total cost = $%.2f \n hours = %d \n charge per hour = $%.2f", bidder1, firstCost, workHours1, charge1);
            System.out.printf("\n %s: \n total cost = $%.2f \n hours = %d \n charge per hour = $%.2f", bidder2, secCost, workHours2, charge2);

        }

    }
}

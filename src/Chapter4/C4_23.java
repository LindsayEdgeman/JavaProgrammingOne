package Chapter4;

import java.util.Scanner;

/**
 * Program calculates employee taxes
 *
 * @author Lindsay Edgeman
 */
public class C4_23 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fedTax = input.nextDouble();
        System.out.print("Enter state tax withholding: ");
        double stateTax = input.nextDouble();

        double grossPay = hours * payRate;
        double fedDeduct = grossPay * fedTax;
        double stateDeduct = grossPay * stateTax;
        double totalDeduct = stateDeduct + fedDeduct;
        double netPay = (grossPay - fedDeduct) - stateDeduct;

        // \/ helps find end percent of the taxes
        fedTax = fedTax * 100;
        stateTax = stateTax * 100;

        System.out.printf("Employee name: %s", name);
        System.out.printf("\n Hours Worked: %2.2f", hours);
        System.out.printf("\n Pay Rate: $%2.2f", payRate);
        System.out.printf("\n Gross Pay: $%2.2f", grossPay);
        System.out.println("\n Deductions: ");
        System.out.printf(" Federal withholding (%2.2f%%):$%2.2f \n", fedTax, fedDeduct);
        System.out.printf(" State withholding (%2.2f%%):$%4.2f", stateTax, stateDeduct);
        System.out.printf("\n  Total Deduction: $%.2f", totalDeduct);
        System.out.printf("\n Net Pay: $%.2f ", netPay);

    }
}

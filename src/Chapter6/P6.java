package Chapter6;

import java.util.Scanner;

/**
 * Program converts currency
 *
 * @author LindsayEdgeman
 */
public class P6 {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double dollar, convert, currency = 0;
        String answer, proceed;

        System.out.print("Enter how much will a euro € will buy in dollars: ");
        double euro = input.nextDouble();
        System.out.print("Enter how much will a pound £ will buy in dollars: ");
        double pound = input.nextDouble();
        System.out.print("Enter how much will a yen ¥ will buy in dollars: ");
        double yen = input.nextDouble();

        do {
            System.out.print("Enter the amount in dollars $ you would like to convert: ");
            dollar = input.nextDouble();

            System.out.print(" Which of these would you like to convert to Euros (E), Pounds Sterling (P), or Yen (Y) ?: ");
            answer = input.next().toLowerCase();
            //reminder* case should not matter

            switch (answer) {
                //choice e
                case "e":
                    convert = Conversion(euro, dollar);
                    System.out.printf("euros: €%6.2f", convert);
                    break;
                //choice p
                case "p":
                    convert = Conversion(pound, dollar);
                    System.out.printf("pounds: £%6.2f", convert);
                    break;
                //choice y
                case "y":
                    convert = Conversion(yen, dollar);
                    System.out.printf("yen: ¥%6.2f", convert);
                    break;

            }

            do {
                System.out.print("\n Are there anymore conversions to perform? \n"
                        + "enter (yes) or (no):  ");
                proceed = input.next().toLowerCase();

            } while (!proceed.equals("no") && !proceed.equals("yes"));
        } while (proceed.equals("yes"));

    }

//converts the choosen currency and dollars 
    /**
     * Conversion method
     *
     * @param currency
     * @param dollar
     * @return total
     */
    public static double Conversion(double currency, double dollar) {
        double total;
        if (dollar > 100) {
            dollar = dollar * .95;
        } else {
            dollar = dollar * .9;
        }
        total = dollar * currency;

        return total;
    }
}

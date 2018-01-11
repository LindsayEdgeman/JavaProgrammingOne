package Chapter2;

import java.util.Scanner;

/**
 * Program to Celsius to Fahrenheit
 *
 * @author Lindsay Edgeman
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args from command line prompt
     */
    public static void main(String[] args) {
        double convert = 9.0 / 5;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Celsius value: ");
        double Celsius = input.nextDouble();

        double Fahrenheit = convert * Celsius + 32;

        System.out.println(Celsius + " Is " + Fahrenheit);

    }

}

package Chapter3;

import java.util.Scanner;

/**
 * Program checks weight of packages
 *
 * @author Lindsay Edgeman
 */
public class C3_33 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight for package 1: ");
        double p1weight = input.nextDouble();
//p = package 
        System.out.println("Enter weight for package 2: ");
        double p2weight = input.nextDouble();

        System.out.println("Enter price for package 1: ");
        double p1price = input.nextDouble();
        System.out.println("Enter price for package 2: ");
        double p2price = input.nextDouble();
        double pack1 = (p1price / p1weight);
        double pack2 = (p2price / p2weight);
        //Comparison of the packages
        if (pack1 < pack2) {
            System.out.println("Package 1 has the better price.");
        } else if (pack2 < pack1) {
            System.out.println("Package 2 has the better price.");
        } else if (pack2 == pack1) {
            System.out.println("Package 2 and package 1 are the same.");
        }
    }
}

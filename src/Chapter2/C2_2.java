package Chapter2;

import java.util.Scanner;

/**
 * Program to find volume of a cylinder
 *
 * @author Lindsay Edgeman
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius value: ");
        double radius = input.nextDouble();

        System.out.print("Enter a length value: ");
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The Area is " + area);
        System.out.println("The volume is " + volume);

    }

}

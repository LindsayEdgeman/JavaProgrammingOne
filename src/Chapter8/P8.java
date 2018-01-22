package Chapter8;

import java.util.Scanner;

/**
 * program to make an array with salesman's workday
 *
 * @author Lindsay Edgeman
 */
public class P8 {

    /**
     * main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] salesmans = {"A", "B", "C", "D"};

        String[] workdays = {"M", "T", "W", "H", "F"};

        double[][] sales = new double[4][5];

        String cont;

        do {
            System.out.println("Enter a name code (A, B, C, or D): ");
            String namecod = input.next();
            System.out.println("Enter a day code (M, T, W, H, F): ");
            String daycod = input.next();
            sales = placeValue(salesmans, workdays, namecod, daycod, sales);
            do {
                System.out.println("Would you like to continue (y or n): ");
                cont = input.next();
            } while (!cont.equalsIgnoreCase("y") && !cont.equalsIgnoreCase("n"));
        } while (cont.equalsIgnoreCase("y"));
        System.out.println("    M   T    W   H   F");
        System.out.println("A [" + sales[0][0] + ", " + sales[0][1] + ", " + sales[0][2] + ", " + sales[0][3] + ", " + sales[0][4] + "]");
        System.out.println("B [" + sales[1][0] + ", " + sales[1][1] + ", " + sales[1][2] + ", " + sales[1][3] + ", " + sales[1][4] + "]");
        System.out.println("C [" + sales[2][0] + ", " + sales[2][1] + ", " + sales[2][2] + ", " + sales[2][3] + ", " + sales[2][4] + "]");
        System.out.println("D [" + sales[3][0] + ", " + sales[3][1] + ", " + sales[3][2] + ", " + sales[3][3] + ", " + sales[3][4] + "]");
    }

    /**
     * placeValue method
     *
     * @param names stores names of salesmen
     * @param days stores days of the week
     * @param nc name code input
     * @param dc day code input
     * @param rate is the row and columns
     * @return rate
     */
    public static double[][] placeValue(String[] names, String[] days, String nc, String dc, double[][] rate) {
        Scanner input = new Scanner(System.in);
        int row = java.util.Arrays.binarySearch(names, nc);
        int column = 0;
        for (int i = 0; i < days.length; ++i) {
            if (days[i].equals(dc)) {
                column = i;
            }
        }
        System.out.println("Enter a new Sales: ");
        double price = input.nextDouble();
        rate[row][column] += price;
        return rate;
    }
}

package Chapter3;

import java.util.Scanner;

/**
 * program flips a coin
 *
 * @author Lindsay Edgeman
 */
public class C3_14 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double randomNum = (int) (Math.random() * 2);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 'h' for (heads) or 't' for (tails): ");
        String guess = input.next();

        if (guess.equals("h") && randomNum == 0) {
            System.out.println("Correct! its heads!");
        } else if (guess.equals("h") && randomNum == 1) {
            System.out.println("incorrect, it is tails!");
        } else if (guess.equals("t") && randomNum == 1) {
            System.out.println("correct! its tails!");
        } else if (guess.equals("t") && randomNum == 0) {
            System.out.println("Incorrect, it is heads!");
        }

    }

}

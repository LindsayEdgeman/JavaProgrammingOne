package Chapter5;

import java.util.Scanner;

/**
 * Program for voting
 *
 * @author LindsayEdgeman
 */
public class P5 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String vote;
        String yVote = "Y";
        String nVote = "N";
        String qVote = "Q";
        int yes = 0;
        int no = 0;

        do {
            System.out.print("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting: ");
            vote = input.next().toUpperCase();
            if (vote.equalsIgnoreCase(yVote)) {
                ++yes;
            } else if (vote.equalsIgnoreCase(nVote)) {// scissors for computer VS rock for player

                ++no;
            } else if (vote.equalsIgnoreCase(qVote)) { // scissors for computer VS paper for player

                break;
            }
        } while (!vote.equals("Q"));
        System.out.println("Yes votes: " + yes + " No votes: " + no);

    }
}

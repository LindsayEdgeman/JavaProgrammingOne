package Chapter5;

import java.util.Scanner;

/**
 * Program plays rock paper scissors.
 *
 * @author Lindsay Edgeman
 */
public class C5_36 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int computerGuess, playerGuess;
        int computerCount = 0;
        int playerCount = 0;

        do {
            System.out.print("Enter scissors (0),rock (1),or paper (2): ");
            playerGuess = input.nextInt();
            computerGuess = (int) (Math.random() * 3);

            switch (computerGuess) {
                case 0: // - scissors
                    if (playerGuess == 0) // scissors for computer VS scissors for player
                    {
                        System.out.println("It is a tie");
                    } else if (playerGuess == 1) // scissors for computer VS rock for player
                    {
                        System.out.println("You win");
                        ++playerCount;
                    } else if (playerGuess == 2) // scissors for computer VS paper for player
                    {
                        System.out.println("You lose");
                        ++computerCount;
                    }
                    break;
                case 1: // - rock
                    if (playerGuess == 1) // rock for computer VS rock for player
                    {
                        System.out.println("It is a tie");
                    } else if (playerGuess == 2) // rock for computer VS paper for player
                    {
                        System.out.println("You win");
                        ++playerCount;
                    } else if (playerGuess == 0) //  rock for computer VS scissors for player
                    {
                        System.out.println("You lose");
                        ++computerCount;
                    }
                    break;

                case 2: // - paper
                    if (playerGuess == 2) // paper for computer VS paper for player
                    {
                        System.out.println("It is a tie");
                    } else if (playerGuess == 0) // paper for computer VS scissors for player
                    {
                        System.out.println("You win");
                        ++playerCount;
                    } else if (playerGuess == 1) // paper for computer VS rock for player
                    {
                        System.out.println("You lose");
                        ++computerCount;
                    }
                    break;
            }
        } while ((computerCount < 2) && (playerCount < 2));

        System.out.println("\nComputer wins: " + computerCount
                + "\nUser wins: " + playerCount);
    }

}

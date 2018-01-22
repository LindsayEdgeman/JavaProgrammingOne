
package Chapter7;
import java.util.Scanner;
/**
 *program finds minimum value out of 10 entered double numbers
 * 
 * @author Lindsay Edgeman
 */
public class C7_9 {
    /**
     * Main method
     * 
     * @param args arguments from command line prompt
     */    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] userInput = new double[10];

        System.out.println("Enter 10 double values:");
        
        for(int i = 0; i < userInput.length; i++) {
            System.out.print(i + " : ");
            userInput[i] = input.nextDouble();
        }

        double minNum = userInput[0];
      
        for(int i = 0; i <userInput.length; i++) {
            if (userInput[i] < minNum) {
                minNum = userInput[i];
            }
        }

        System.out.println("The minimum number is: " + minNum);
    }

}

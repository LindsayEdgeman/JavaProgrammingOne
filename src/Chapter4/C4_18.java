package Chapter4;

import java.util.Scanner;

/**
 * Program to use Single letters and numbers to find your grade and class
 *
 * @author Lindsay Edgeman
 */
public class C4_18 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two characters: ");
        String a = input.next().toUpperCase();
        char b = a.charAt(0);
        char c = a.charAt(1);
        String output;
        String output2;
        if ((b == 'M' || b == 'C' || b == 'I') && (c == '1' || c == '2' || c == '3' || c == '4')) {
            //switches find the possible inputs and the invaild options
            switch (b) {
                case 'M':
                    System.out.print("Mathmatics");
                    break;
                case 'C':
                    System.out.print("Computer Science");
                    break;
                case 'I':
                    System.out.print("Information Technology");
                    break;
                default:
                    output = "invalid";
            }
            switch (c) {
                case '1':
                    System.out.print(" Freshman ");
                    break;
                case '2':
                    System.out.print(" Sophmore ");
                    break;
                case '3':
                    System.out.print(" Junior ");
                    break;
                case '4':
                    System.out.print(" Senior ");
                    break;
                default:
                    output2 = "invalid";
            }
        } else {
            System.out.println("Invalid Input");
        }
    }

}

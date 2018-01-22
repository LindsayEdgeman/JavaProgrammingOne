package Chapter7;

import java.util.Scanner;

/**
 * Program to rank students grade
 *
 * @author Lindsay Edgeman
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bestGrade = 0;
//takes the best grade
        System.out.print("Enter number of students: ");

        int numStudents = input.nextInt();
//number of students
        int[] grades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade " + (i + 1) + " : ");
            grades[i] = input.nextInt();

            if (grades[i] > bestGrade) {
                bestGrade = grades[i];
            }
        }
//organizes students and grades
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= (bestGrade - 10)) {
                System.out.println("Student " + (i + 1) + " grade = A");
            } else if (grades[i] >= (bestGrade - 20)) {
                System.out.println("Student " + (i + 1) + " grade = B");
            } else if (grades[i] >= (bestGrade - 30)) {
                System.out.println("Student " + (i + 1) + " grade = C");
            } else if (grades[i] >= (bestGrade - 40)) {
                System.out.println("Student " + (i + 1) + " grade = D");
            } else {
                System.out.println("Student " + (i + 1) + " grade = F");
            }
        }
    }

}

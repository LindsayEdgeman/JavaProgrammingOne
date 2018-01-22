package Chapter8;

/**
 * Program shows weekly hours and shows employee hours
 *
 * @author Lindsay Edgeman
 */
public class C8_4 {
/**
 * Main method
 * 
 * @param args arguments from the command prompt line 
 */
    public static void main(String[] args) {
        int[][] weeklyHours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        int[][] totalHours = getTotalHours(weeklyHours);

        bSortDecrease(totalHours);

        for (int[] totalHour : totalHours) {
            System.out.println("Employee " + totalHour[0] + ": " + totalHour[1]);
        }
    }
/**
 * bSortDecrease Method
 * 
 * @param array just a collection for an array of ints
 * 
 */
    public static void bSortDecrease(int[][] array) {
        boolean change;

        do {
            change = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i][1] < array[i + 1][1]) {
                    int[] temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    change = true;
                }
            }
        } while (change);
    }
/**
 * getTotalHours method
 * 
 * @param hours gets number of hours
 * @return the total hours 
 */
    public static int[][] getTotalHours(int[][] hours) {

        int[][] totalHours = new int[hours.length][2];

        for (int i = 0; i < hours.length; i++) {
            int sum = 0;
            for (int j = 0; j < hours[i].length; j++) {
                sum += hours[i][j];
            }
            totalHours[i][0] = i;
            totalHours[i][1] = sum;
        }
        return totalHours;
    }
}


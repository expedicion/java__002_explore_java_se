package example_12;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class SimpleArray1 {
    public static void main(String args[]) {
        int[] daysInMonth;
        daysInMonth = new int[12];
        String[] namesOfMonths;
        namesOfMonths = new String[12];

        daysInMonth[0] = 31; namesOfMonths[0] = "January";
        daysInMonth[1] = 28; namesOfMonths[1] = "February";
        daysInMonth[2] = 31; namesOfMonths[2] = "March";
        daysInMonth[3] = 30; namesOfMonths[3] = "April";
        daysInMonth[4] = 31; namesOfMonths[4] = "May";
        daysInMonth[5] = 30; namesOfMonths[5] = "June";
        daysInMonth[6] = 31; namesOfMonths[6] = "July";
        daysInMonth[7] = 31; namesOfMonths[7] = "August";
        daysInMonth[8] = 30; namesOfMonths[8] = "September";
        daysInMonth[9] = 31; namesOfMonths[9] = "October";
        daysInMonth[10] = 30; namesOfMonths[10] = "November";
        daysInMonth[11] = 31; namesOfMonths[11] = "December";

        int i = 0;
        for (int x: daysInMonth) {
            System.out.println(namesOfMonths[i]);
            System.out.println(x + "\n");
            i++;
        }
    }
}

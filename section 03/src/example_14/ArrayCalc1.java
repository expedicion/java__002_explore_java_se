package example_14;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class ArrayCalc1 {
    public static void main(String args[]) {
        double[] numberArray = {12, 34, 0.8, 10, 9, 5};
        double sum = 0;
        int i;

        for (i = 0; i < numberArray.length; i++)
            sum = sum + numberArray[i];

        System.out.println("The average value is -> " + sum / numberArray.length);
        System.out.println("The average value is -> " + Math.floor(sum / numberArray.length) + " #by floor");
        System.out.println("The average value is -> " + Math.ceil(sum / numberArray.length) + " #by ceil");
    }
}

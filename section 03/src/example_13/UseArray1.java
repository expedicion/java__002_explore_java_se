package example_13;

import java.util.Random;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class UseArray1 {
    public static void main(String args[]) {
        int[] myLuckyNumber = {22, 18, 11, 3, 333, 340, 81, 971, 467, 881, 220, 909};
        Random rand = new Random();
        int index = rand.nextInt(12);

        System.out.println("My lucky number is -> " + myLuckyNumber[index]);
    }
}

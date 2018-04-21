package example_02;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class If2 {
    public static void main(String[] args) {
        int number = 32;
        char result;

        if (number >= 30) {
            result = 'A';
        } else if (number >= 25) {
            result = 'B';
        } else if (number >= 20) {
            result = 'C';
        } else if (number >= 15) {
            result = 'D';
        } else {
            result = 'F';
        }
        System.out.println("The end result is -> " + result);
    }
}

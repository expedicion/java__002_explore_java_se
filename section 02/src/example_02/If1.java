package example_02;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class If1 {
    public static void main(String args[]) {
        int a, b;
        a = 300;
        b = 100;

        if (a > b) {
            System.out.println("Variable A is greater than B.");
        }

        b *= 3;
        if (a == b) {
            System.out.println("Variable A is equal to B.");
        }

        a = b + 20;
        if (a > b) {
            System.out.println("Variable A is less than B.");
        }

        if (a == b) {
            System.out.println("tego nie zobaczysz");
        }
    }
}

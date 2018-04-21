package example_04;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class Variable1 {
    public static void main(String args[]) {
        int a, b;
        a = 0;
        b = 200;

        for (; a < 10; a++) {
            System.out.println("Variable A is ->\t" + a);
            System.out.println("Variable B is ->\t" + b + "\n");
            b -= 2;
        }
    }
}

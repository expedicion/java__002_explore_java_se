package example_06;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class InitializeDynamically1 {
    public static void main(String args[]) {
        double a = 1.1, b = 2.2, c = 3.3;

        double sqrtValueA = Math.sqrt(a * a);
        double sqrtValueB = Math.sqrt(b * b);
        double sqrtValueC = Math.sqrt(c * c);

        System.out.println("Sqrt value of A -> " + sqrtValueA);
        System.out.println("Sqrt value of B -> " + sqrtValueB);
        System.out.println("Sqrt value of C -> " + sqrtValueC);
    }
}

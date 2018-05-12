package example_04;

/**
 * Created by Nostromo on 2018-02-11.
 */
public class IncrementDecrement1 {
    public static void main(String args[]) {
        int a;
        System.out.println("| a++ | ++a | a-- | --a |\n");
        System.out.println("Only first call of the variable a = 1!\n");

        a = 1;
        System.out.println("a++ -> " + a++);
        a = 1;
        System.out.println("++a -> " + ++a);
        a = 1;
        System.out.println("a-- -> " + a--);
        a = 1;
        System.out.println("--a -> " + --a);
    }
}

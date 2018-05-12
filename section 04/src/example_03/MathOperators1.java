package example_03;

/**
 * Created by Nostromo on 2018-02-11.
 */
public class MathOperators1 {
    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("a -> " + a + "\nb -> " + b + "\nc -> " + c);
        System.out.println();

        a += 1;
        System.out.println("a = " + a + "\t// a += 1");
        b *= 2;
        System.out.println("b = " + b + "\t// b *= 2");
        c *= 3;
        System.out.println("c = " + c + "\t// c *= 3");
        System.out.println();
        a += b * c;
        System.out.println("a = " + a + "\t// a += b * c");
        b += a * c;
        System.out.println("b = " + b + "\t// b += a * c");
        c += a * b;
        System.out.println("c = " + c + "\t// c += a * b");
        System.out.println();
        a %= 2;
        System.out.println("a = " + a + "\t// a %= 2");
        b %= 5;
        System.out.println("b = " + b + "\t// b %= 5");
        c %= 10;
        System.out.println("c = " + c + "\t// c %= 10");
        System.out.println();
    }
}

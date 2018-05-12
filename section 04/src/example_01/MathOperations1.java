package example_01;

/**
 * Created by Nostromo on 2018-02-11.
 */
public class MathOperations1 {
    public static void main(String args[]) {
        System.out.println("Math operation -> integer");
        int varInt1 = 2 + 3;
        int varInt2 = varInt1 * 5;
        int varInt3 = varInt2 / 3;
        int varInt4 = varInt3 - varInt2;
        int varInt5 = -varInt4;
        System.out.println("A = " + varInt1 + "\t <- 2 + 3");
        System.out.println("B = " + varInt2 + "\t <- A * 5");
        System.out.println("C = " + varInt3 + "\t <- B / 3");
        System.out.println("D = " + varInt4 + "\t <- C - B");
        System.out.println("E = " + varInt5 + "\t <- -D");
        System.out.println("---------------------------------");
        System.out.println("Math operations -> double");
        double varDouble1 = 2 + 3;
        double varDouble2 = varDouble1 * 5;
        double varDouble3 = varDouble2 / 3;
        double varDouble4 = varDouble3 - varInt2;
        double varDouble5 = -varDouble4;
        System.out.println("A = " + varDouble1 + "\t\t\t <- 2 + 3");
        System.out.println("B = " + varDouble2 + "\t\t <- A * 5");
        System.out.println("C = " + varDouble3 + "\t <- B / 3");
        System.out.println("D = " + varDouble4 + "\t <- C - B");
        System.out.println("E = " + varDouble5 + "\t <- -D");
    }
}

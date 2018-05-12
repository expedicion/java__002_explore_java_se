package example_12;

/**
 * Created by Nostromo on 2018-02-11.
 */
public class TernaryOperators1 {
    public static void main(String args[]) {
        int varA;
        int varB;
        int varC;
        int varD;

        varA = -123;
        varB = varA > 0 ? varA : -varA;

        System.out.println("A -> " + varA);
        System.out.println("B -> " + varB);

        System.out.print("The absolute value of ");
        System.out.println(varA + " is " + varB);

//      ?:      Ternary (shorthand for if-then-else statement)

        varC = 1;
        varD = (varA + varB) == 0 ? 0 : varC;
        System.out.println("Test of absolute value equals: " + varD);
        System.out.println(
                varD == 0 ? "Absolute value test is true." : "Absolute value test is false.");
    }
}
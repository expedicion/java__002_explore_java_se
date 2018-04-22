package example_09;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class ScopeTest1 {
    public static void main(String args[]) {
        int outerVariable = 101;

        // New scope declaration
        {
            int innerVariable = 202;
            System.out.println("Inner variable is -> " + innerVariable);
        }
//        System.out.println("Inner variable is -> " + innerVariable); // ERROR
        System.out.println("Outer variable is -> " + outerVariable);
    }
}

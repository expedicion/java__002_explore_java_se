package example_07;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class BlockScope1 {
    public static void main(String args[]) {
        int outerVariable;
        outerVariable = 101;

        if (outerVariable == 101) {
            int innerVariable = 202;

            System.out.println("We've got variables: " + outerVariable + " and " + innerVariable + ".");
            outerVariable = innerVariable * innerVariable;
        }

        System.out.println("Show me outer variable -> " + outerVariable);
    }
}

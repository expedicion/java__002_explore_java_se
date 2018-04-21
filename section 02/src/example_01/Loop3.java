package example_01;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class Loop3 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("Iteration No. -> " + i);
            if (i == 9) {
                System.out.println("Break starts work.\n");
                break;
            }
            System.out.println("Break does not work.");
            if (i == 7) {
                System.out.println("Continue starts work.\n");
                continue;
            }
            System.out.println("End of if in a single loop.");
            System.out.println("If I see this then break or continue does not work.\n");
        }
        System.out.println("End of for-loop designed for 10 iterations.\n" + "The i number is -> " + i);
    }
}

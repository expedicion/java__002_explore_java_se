package example_15;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class Use2DArray1 {
    public static void main(String args[]) {
        int[][] array2D = new int[10][20];
        int i, j, k = 1;

        // Assigning
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 20; j++) {
                array2D[i][j] = k;
                k++;
            }
        }

        // Printing
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 20; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

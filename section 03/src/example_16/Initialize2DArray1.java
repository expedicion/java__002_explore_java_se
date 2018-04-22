package example_16;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class Initialize2DArray1 {
    public static void main(String args[]) {
        int[][] array2D = new int[7][];
        array2D[0] = new int[1];
        array2D[1] = new int[2];
        array2D[2] = new int[3];
        array2D[3] = new int[4];
        array2D[4] = new int[5];
        array2D[5] = new int[6];
        array2D[6] = new int[7];

        int i, j, k = 1;

        for (i = 0; i < 7; i++) {
            for (j = 0; j < i + 1; j++) {
                array2D[i][j] = k;
                k++;
            }
        }

        for (i = 0; i < 7; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

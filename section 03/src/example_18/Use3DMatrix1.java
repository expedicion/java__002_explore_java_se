package example_18;

/**
 * Created by Nostromo on 2018-02-11.
 */
public class Use3DMatrix1 {
    public static void main(String args[]) {
        int[][][] array3D = new int[3][4][4];

        int i, j, k, z = 10;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 4; k++) {
                    array3D[i][j][k] = z;
                    z++;
                }
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 4; k++) {
                    System.out.print(array3D[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

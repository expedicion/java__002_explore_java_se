package example_17;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class Matrix1 {
    public static void main(String args[]) {
        char[][] matrix = {
                {'A', 'B', 'C', 'D', 'E'},
                {62, 64, 65, 66, 67},
                {'E', 'F', 'G', 'I', 'J'},
                {71, 73, 74, 75, 76}
        };

        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

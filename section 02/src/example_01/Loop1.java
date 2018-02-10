package example_01;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class Loop1 {
    public static void main(String[] args) {
        int x1;

        for (x1 = 9; x1 == 0; x1--){
            System.out.println(x1);
        }

        for (int x2 = 0; x2 < 10 ; x2++) {
            System.out.println(x2);
        }

        int[] table = {1, 2, 3, 4, 5};
        for (int x3: table) {
            System.out.println(x3);
        }
    }
}

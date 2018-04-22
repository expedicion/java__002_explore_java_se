package example_08;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class VarScope1 {
    public static void main(String args[]) {
        int x;

        for(x = 0; x < 3; x++) {
            int y = -1; // y jest inicjalizowane przy każdej iteracji pętli
            System.out.println("y wynosi " + y); // zawsze zostanie wyświetlone –1
            y = 100;
            System.out.println("teraz y wynosi " + y);
        }
    }
}

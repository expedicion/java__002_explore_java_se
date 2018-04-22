package example_03;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class Char2 {
    public static void main(String[] args) {
        char letter;

        for (int i= 0; i < 31; i++) {
            letter = (char)( i + 60);
            System.out.print(letter + " ");
        }
    }
}

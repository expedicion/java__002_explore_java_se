package example_04;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class CharMod1 {
    public static void main(String args[]) {
        char characterA;
        char characterB;

        characterA = 'G';
        System.out.println("Value of character A is -> " + characterA);
        characterA++;
        System.out.println("After decreasing value of character A is -> " + characterA);

        characterB = 'G';
        System.out.println("Value of character B is -> " + characterB);
        characterB--;
        System.out.println("After decreasing value of character B is -> " + characterB);
    }
}

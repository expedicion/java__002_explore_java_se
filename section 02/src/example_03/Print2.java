package example_03;

import static java.lang.System.out;
//import static java.lang.System.*;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class Print2 {
    public static void main(String[] args) {
        int number = 1;
        out.print("I have been using static import. The number is -> " + number + "\n");
        out.println("I have been using static import. The number is -> " + number);
        out.printf("I have been using static import. The number is -> %d", number);
    }
}

package example_07;

/**
 * Created by Nostromo on 2018-02-11.
 */
public class LeftShifting1 {
    public static void main(String args[]) {
        // ~     ->  Unary bitwise complement
        // <<    ->  Signed left shift
        // >>    ->  Signed right shift
        // >>>   ->  Unsigned right shift
        // &     ->  Bitwise AND
        // ^     ->  Bitwise exclusive OR
        // |     ->  Bitwise inclusive OR

        // 0xFFFFFFE is binary                    -> 0000 1111 1111 1111 1111 1111 1111 1110
        // After the left shift it becomes binary -> 0001 1111 1111 1111 1111 1111 1111 1100
        int num = 0xFFFFFFE;

        // left shift
        for (int i = 0; i < 7; i++) {
            num = num << 1;
            System.out.println(num);
        }

        // right shift
        for (int i = 0; i < 7; i++) {
            num = num >> 1;
            System.out.println(num);
        }

        // 3 << 2
        // The 3 (int) is converted to binary number 0000 0000 0000 0000 0000 0000 0000 00011
        // The digital high (left) two zero out, other numbers are towards the left translation 2 positions
        // In the low (right) two zero insertion.
        // The final result is obtained is 0000 0000 0000 0000 0000 0000 0000 1100

        System.out.println("3 << 2 -> " + (3 << 2));
    }
}

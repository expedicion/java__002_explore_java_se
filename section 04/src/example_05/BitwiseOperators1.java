package example_05;

/**
 * Created by Nostromo on 2018-02-11.
 */
public class BitwiseOperators1 {
    public static void main(String args[]) {
        String[] binaryNumbers = {
                "0000", // 0
                "0001", // 1
                "0010", // 2
                "0011", // 3
                "0100", // 4
                "0101", // 5
                "0110", // 6
                "0111", // 7
                "1000", // 8
                "1001", // 9
                "1010", // 10
                "1011", // 11
                "1100", // 12
                "1101", // 13
                "1110", // 14
                "1111"  // 15
        };

        int a = 3;                      // 3  -> 0011 (0^3+0^2+2^1+2^0)
        int b = 6;                      // 6  -> 0110
        int c = a | b;                  // 7  -> 0111
        int d = a & b;                  // 2  -> 0010
        int e = a ^ b;                    // 5  -> 0101
        int f = (~a & b) | (a & ~b);    // 5  -> 0101
        int g = ~a & 0x0f;              // 12 -> 1100

        System.out.println(binaryNumbers[a] + " <- A");
        System.out.println(binaryNumbers[b] + " <- B");
        System.out.println(binaryNumbers[c] + " <- A | B");
        System.out.println(binaryNumbers[d] + " <- A & B");
        System.out.println(binaryNumbers[e] + " <- A^B");
        System.out.println(binaryNumbers[f] + " <- (~A & B) | (A & ~B)");
        System.out.println(binaryNumbers[g] + " <- ~A");
    }
}

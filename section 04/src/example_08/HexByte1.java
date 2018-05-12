package example_08;

/**
 * Created by Nostromo on 2018-02-11.
 */
public class HexByte1 {
    static public void main(String args[]) {
        char[] hex = {
                '0', // hexadecimal to decimal -> 0
                '1', // hexadecimal to decimal -> 1
                '2', // hexadecimal to decimal -> 2
                '3', // hexadecimal to decimal -> 3
                '4', // hexadecimal to decimal -> 4
                '5', // hexadecimal to decimal -> 5
                '6', // hexadecimal to decimal -> 6
                '7', // hexadecimal to decimal -> 7
                '8', // hexadecimal to decimal -> 8
                '9', // hexadecimal to decimal -> 9
                'A', // hexadecimal to decimal -> 10
                'B', // hexadecimal to decimal -> 11
                'C', // hexadecimal to decimal -> 12
                'D', // hexadecimal to decimal -> 13
                'E', // hexadecimal to decimal -> 14
                'F'  // hexadecimal to decimal -> 15
        };

        String hexadecimal = String.valueOf(hex[11]);
        int decimal = Integer.parseInt(hexadecimal, 16);

        System.out.println(decimal);
    }
}

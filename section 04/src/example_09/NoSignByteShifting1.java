package example_09;

/**
 * Created by Nostromo on 2018-02-11.
 */
public class NoSignByteShifting1 {
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

//        ~       Unary bitwise complement
//        <<      Signed left shift
//        >>      Signed right shift
//        >>>     Unsigned right shift
//        &       Bitwise AND
//        ^       Bitwise exclusive OR
//        |       Bitwise inclusive OR

        byte varA = (byte) 0xF1;
        byte varB = (byte) (varA >> 4);
        byte varC = (byte) (varA >>> 4);
        byte varD = (byte) ((varA & 0xFF) >> 4);

        System.out.println("A -> 0x"
                + hex[(varA >> 4) & 0x0F]
                + hex[varA & 0x0F]);
        System.out.println("B >> 4 -> 0x"
                + hex[(varB >> 4) & 0x0F]
                + hex[varB & 0x0F]);
        System.out.println("C >>> 4 -> 0x"
                + hex[(varC >> 4) & 0x0F]
                + hex[varC & 0x0F]);
        System.out.println("(D & 0xFF) >> 4 -> 0x"
                + hex[(varD >> 4) & 0x0F]
                + hex[varD & 0x0F]);
    }
}
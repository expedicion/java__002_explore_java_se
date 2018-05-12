package example_10;

/**
 * Created by Nostromo on 2018-02-11.
 */
public class ByteOperations1 {
    public static void main(String args[]) {
        int a = 3;
        int b = 3;
        int c = 3;
        int d = 3;

//        ~       Unary bitwise complement
//        <<      Signed left shift
//        >>      Signed right shift
//        >>>     Unsigned right shift
//        &       Bitwise AND
//        ^       Bitwise exclusive OR
//        |       Bitwise inclusive OR

        a = a | 1;
        b = b >> 1;
        c = c << 1;
        d = d ^ c;

        System.out.println("A = B = C = D = 3\n");
        System.out.println("A = " + a + "\t<- a | 1");
        System.out.println("B = " + b + "\t<- b >> 1");
        System.out.println("C = " + c + "\t<- c << 1");
        System.out.println("D = " + d + "\t<- d ^ c");
    }
}

package example_06;

/**
 * Created by Nostromo on 2018-02-11.
 */
public class ByteShifting1 {
    public static void main(String args[]) {
//      &   -> operator performs a bitwise AND operation
//      ^   -> operator performs a bitwise exclusive OR operation
//      |   -> operator performs a bitwise inclusive OR operation
//      ~   -> operator inverts a bit pattern
//      <<  -> signed left shift operator shifts a bit pattern to the left
//      >>  -> signed right shift operator shifts a bit pattern to the right
//      >>> -> unsigned right shift operator shifts a zero into the leftmost position
//      >>  -> the leftmost position after ">>" depends on sign extension

        byte a = 64;
        System.out.println("The A is -> " + a);

        byte b;
        b = (byte) (a << 2);
        System.out.println("The B is -> " + b);

        int c;
        c = a << 2;
        System.out.println("The I is -> " + c);

        int d = 0x000F;   // -> 15
        System.out.println("The D is -> " + d);

        int e = 0x0002;   // -> 2
        System.out.println("The E is -> " + e);

        System.out.println("D AND E -> " + d + " & " + e);
        System.out.println("But A & E -> " + (d & e));
    }
}

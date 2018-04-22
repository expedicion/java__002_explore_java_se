package example_10;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class Casting1 {
    public static void main(String args[]) {
        byte byteVariable;
        int intVariable = 259;
        double doubleVariable = 432.456;

        System.out.println("Conversion from integer to byte.");
        System.out.println("Integer value is -> " + intVariable);
        byteVariable = (byte) intVariable;
        System.out.println("Byte value is -> " + byteVariable +"\n");

        System.out.println("Conversion from double to integer.");
        System.out.println("Double value is -> " + doubleVariable);
        intVariable = (int) doubleVariable;
        System.out.println("Integer value is -> " + intVariable +"\n");

        System.out.println("Conversion from double to byte.");
        System.out.println("Double value is -> " + doubleVariable);
        byteVariable = (byte) doubleVariable;
        System.out.println("Byte value is -> " + byteVariable);
    }
}

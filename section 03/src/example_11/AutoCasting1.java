package example_11;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class AutoCasting1 {
    public static void main(String args[]) {
        byte byteVal = 42;
        char charVal = 'a';
        short shortVal = 1024;
        int intVal = 50000;
        float floatVal = 5.67f;
        double doubleVal = .1234;

        double result = (floatVal * byteVal) + (intVal / charVal) - (doubleVal * shortVal) + shortVal;

        System.out.println((floatVal * byteVal) + " + " + (intVal / charVal) + " - " + (doubleVal * shortVal) + " + " + shortVal);
        System.out.println((floatVal * byteVal) + (intVal / charVal) - (doubleVal * shortVal) + shortVal);
        System.out.println("The result of variable is -> " + result);
    }
}

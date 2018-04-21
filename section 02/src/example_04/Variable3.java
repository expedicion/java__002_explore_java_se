package example_04;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class Variable3 {
    public static void main(String[] args) {
        Variable2 var = new Variable2();
        var.variableBoolean = true;
        var.variableByte = 127;
        var.variableChar = 'X';
        var.variableDouble = 123_000_897D;
        var.variableFloat = 1244F;
        var.variableInt = 455;
        var.variableLong = 34324L;
        var.variableShort = 444;
        System.out.println("Boolean\t" + var.variableBoolean);
        System.out.println("Byte\t" + var.variableByte);
        System.out.println("Char\t" + var.variableChar);
        System.out.println("Double\t" + var.variableDouble);
        System.out.println("Float\t" + var.variableFloat);
        System.out.println("Int\t\t" + var.variableInt);
        System.out.println("Long\t" + var.variableLong);
        System.out.println("Short\t" + var.variableShort);
    }
}

package example_11;

/**
 * Created by Nostromo on 2018-02-11.
 */
public class BoolLogic1 {
    public static void main(String args[]) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;

//        &       Operator AND
//        ^       Operator OR
//        |       Operator OR
//        !       Operator NOT

        System.out.println("        A = " + a);
        System.out.println("        B = " + b);
        System.out.println("      A|B = " + c);
        System.out.println("      A&B = " + d);
        System.out.println("      A^B = " + e);
        System.out.println("!A&B|A&!B = " + f);
        System.out.println("       !A = " + g);
    }
}

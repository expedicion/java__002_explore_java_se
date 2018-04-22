package example_02;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class FigureCalc1 {
    public static void main(String args[]) {
        double piValue;
        double diameter;
        double field;

        diameter = 10.8;
        piValue = 3.1416;
        field = piValue * (diameter * diameter)/4;
        System.out.println("Field of the circle is -> " + field);
        System.out.printf("Field of the circle is -> %.2f", field);
    }
}

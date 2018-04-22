package example_01;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class Calculate2 {
    public static void main(String[] args) {
        int mySpeed;
        int myConvertedSped;

        mySpeed = 6; // [m/s]
        myConvertedSped = mySpeed * (3600 / 1000); // [km/h]

        System.out.println("If my speed is " + mySpeed + " [m/s], ");
        System.out.println("then my converted speed will be " + myConvertedSped + " [km/h].");
    }
}

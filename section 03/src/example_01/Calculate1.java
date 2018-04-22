package example_01;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class Calculate1 {
    public static void main(String args[]) {
        int speedOfLight;
        long daysOfTravel;
        long seconds;
        long traveledDistance;

        speedOfLight = 300_000_000; // [m/s]
        daysOfTravel = 365;
        seconds = daysOfTravel * 24 * 3600; // 24 h * 3600 sek.
        traveledDistance = speedOfLight * seconds; //

        System.out.print("The light can travel a distance of " + traveledDistance + " m, ");
        System.out.print("during the " + daysOfTravel + " days!");
    }
}

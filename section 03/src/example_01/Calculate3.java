package example_01;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class Calculate3 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4};
        int[] duplcate = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            duplcate[i] = array[i];
        }

        for (int a: array) {
            System.out.print(a + ", ");
        }
        System.out.println("\n");
        for (int b: duplcate) {
            System.out.print(b + ", ");
        }

        System.out.println("\nCheck the assignment:");
        duplcate[1] = 123;
        System.out.println("2nd element of the array ->\t\t" + array[1]);
        System.out.println("2nd element of the duplicate ->\t" + duplcate[1]);
    }
}

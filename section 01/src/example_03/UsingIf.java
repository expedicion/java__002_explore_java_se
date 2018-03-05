package example_03;

class UsingIf {
    public static void main(String args[]) {
        int a, b;
        a = 3;
        b = 9;

        if (a < b) {
            System.out.println("A < B");
            System.out.println("A -> " + a + " | B -> " + b);
        }

        a += 6;
        if (a == b) {
            System.out.println("A = B");
            System.out.println("A -> " + a + " | B -> " + b);
        }

        a -= 11;
        if (a > b) {
            System.out.println("A > B");
            System.out.println("A -> " + a + " | B -> " + b);
        }
    }
}
package example_05;

class BlockAndLoop {
    public static void main(String args[]) {
        int x, y, z;
        y = 102;
        z = 110;

        for (x = 0; x < 10; x++) {
            System.out.println("X -> " + x);
            System.out.println("Y -> " + y);
            System.out.println("Z -> " + z);
            y = y * 3;
            z = y * x;
        }
    }
}

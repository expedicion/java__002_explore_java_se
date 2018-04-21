package example_04;

class SimpleLoop {
    public static void main(String args[]) {
        System.out.println("Start iteration:\n");
        int i;
        int a = 10;
        for (i = 0; i < 10; i++) {
            System.out.println(" Iterator: " + i);
            System.out.println("Reverse-iterator: " + a--);
        }
    }
}
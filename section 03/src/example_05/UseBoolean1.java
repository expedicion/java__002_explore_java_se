package example_05;

/**
 * Created by Nostromo on 2018-02-10.
 */
public class UseBoolean1 {
    public static void main(String args[]) {
        int iterator = 0;
        boolean flag;
        flag = false;
        System.out.println("Value of the flag -> " + flag);
        flag = true;
        System.out.println("Value of the flag -> " + flag);

        if(flag){
            System.out.println("Run if 1.");
            iterator++;
        }

        flag = false;
        if(flag){
            System.out.println("Run if 2.");
            iterator++;
        }

        System.out.println("Application executes if -> " + iterator);
    }
}


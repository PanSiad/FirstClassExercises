import java.util.Scanner;

public class ZeroDivision {

    public static void main() {

        System.out.println("Please enter a number: ");
        //Read input from console
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        //convert string to integer
        int x = Integer.parseInt(s);

        System.out.println("Please enter a divider: ");
        //Read input from console
        String s1 = in.nextLine();
        //convert string to integer
        int y = Integer.parseInt(s1);

//        float x = 5.2f;
//        float y = 0;

        if (y == 0) {
            //Informative message about division with 0
            System.out.println("The divider is zero, division cannot be done!");
        } else {
            System.out.println("Division result: " + x / y);
        }

    }
}

import java.util.Scanner;

public class RepresentationExercise {

    public static void main(String[] args) {

//        int n, k;
        int division, modulo;

//        n = 10;
//        k = 7;

        System.out.println("Please enter a number: ");
        //Read input from console
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        //convert string to integer
        int n = Integer.parseInt(s);

        System.out.println("Please enter a divider: ");
        //Read input from console
        String s1 = in.nextLine();
        //convert string to integer
        int k = Integer.parseInt(s1);

        division = n / k;
        modulo = n % k;

        System.out.println(n + " = " + k + "*" + division + " + " + modulo);

    }

}

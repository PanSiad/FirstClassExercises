import java.util.Scanner;

public class OddOrEvenNumber {

    public static void main() {

        //int a = -5;

        System.out.println("Please enter an integer: ");
        //Read input from console
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        //convert string to integer
        int a = Integer.parseInt(s);

        //Condition for even number like 0, 2, 4, 6, 8, ..
        if (a % 2 == 0) {
            System.out.println(a + " is even!");
        }
        //Condition for odd number like 0, 2, 4, 6, 8, ..
        else if (a % 2 == 1) {
            System.out.println(a + " is odd!");
        }
        //Else condition - there is no chance to enter this case
        else {
            System.out.println("No chance entering else if a is 0 or bigger.");
        }
    }


}

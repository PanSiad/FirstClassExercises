import java.util.Scanner;

public class LeapYear {

    public static void executeMethod() {

        //years sample
        int[] years = {1600, 1800, 2000, 2020, 2024, 2017, 1821, 1900};

//        for (int year : years
//             ) {

        System.out.println("Please enter a year to check if it is a leap year: ");
        //Read input from console
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        //convert string to integer
        int year = Integer.parseInt(s);

        //check whether a year is leap or not
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }
//        }

    }

}

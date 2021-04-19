import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;

        System.out.print("The exercises below are available for testing:\n" +
                "1 = Odd or Even Numbe1r\n" +
                "2 = Leap Year\n" +
                "3 = Prime Numbers\n" +
                "4 = Representation Exercise\n" +
                "5 = Harmonic Series\n" +
                "6 = Factorial Calculation\n" +
                "7 = Zero Division\n" +
                "Enter a number between 1-7 for the corresponding exercise that you want to test.\n\n");
        System.out.print("Input: ");

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        n = Integer.parseInt(s);

        while (n != 1 && n != 2 && n != 3 && n != 4 && n != 5 && n != 6 && n != 7) {
            System.out.println("Given number is outside 1-7 range. Please enter a new one:");
            System.out.print("Input: ");

            s = in.nextLine();
            n = Integer.parseInt(s);
        }

        switch (n) {
            case 1:
                OddOrEvenNumber.executeMethod();
                break;
            case 2:
                LeapYear.executeMethod();
                break;
            case 3:
                PrimeNumbers.executeMethod();
                break;
            case 4:
                RepresentationExercise.executeMethod();
                break;
            case 5:
                HarmonicSeries.executeMethod();
                break;
            case 6:
                FactorialCalculation.executeMethod();
                break;
            case 7:
                ZeroDivision.executeMethod();
                break;
            default:
                //While loop above ensures no default case is possible

        }

    }

}

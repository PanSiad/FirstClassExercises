public class FactorialCalculation {

    public static void main(String[] args) {

        int n = 7;
        int y;
        long factorialFromApproach1 = 1;
        long factorialFromApproach2 = 1;


        if (n > 0) {

            //Looping Approach #1
            for (int i = n; i > 0; i--) {
                factorialFromApproach1 *= i;
            }
            System.out.println("Factorial of " + n + " is: " + factorialFromApproach1);

            //Looping Approach #2
            y = n;
            while (y > 0) {
                factorialFromApproach2 *= y;
                y--;
            }
            System.out.println("Factorial of " + n + " is: " + factorialFromApproach2);

        } else if (n == 0) {
            System.out.println("Factorial of " + n + " is: 0");
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }

}

public class PrimeNumbers {

    public static void executeMethod() {

        System.out.println("Prime numbers between 2-100 are:");

        System.out.println("2");
        //loop for numbers between 2-100
        for (int i = 3; i <= 100; i = i + 2) {

            //check if i is a Prime Number
            boolean isPrime = isPrime(i);

            //if i is a prime number, print it
            if (isPrime) {
                System.out.println(i);
            }

            /*

            Prime numbers between 2-100 are:
            2, 3, 5, 7, 11, 13, 17, 19,
            23, 29, 31, 37, 41, 43, 47,
            53, 59, 61, 67, 71, 73, 79
            83, 89, 97.

            */

        }

    }

    private static boolean isPrime(int currentNumber) {

        boolean isPrime = true;

        int y = 2;
        int sqrt = (int) squareRoot(currentNumber);

        //loop for numbers between 2-i
        while (y <= sqrt && isPrime) {

            //check if a number other than 1 and itself is a factor
            if (currentNumber % y == 0) {
                isPrime = false;
            }
            y++;
        }

        return isPrime;
    }

    private static double squareRoot(int number) {

        double t;
        double squareroot = ((double) number ) / 2;
        do {
            t = squareroot;
            squareroot = (t + (number / t)) / 2;
        }
        while ((t - squareroot) != 0);
        return squareroot;
    }

}

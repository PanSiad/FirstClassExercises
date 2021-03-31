public class PrimeNumbers {

    public static void main(String[] args) {

        System.out.println("Prime numbers between 2-100 are:");

        //loop for numbers between 2-100
        for (int i = 2; i <= 100; i++) {

            int y = 2;
            boolean isPrime = true;

            //loop for numbers between 2-i
            while (y < i && isPrime) {

                //check if a number other than 1 and itself is a factor
                if (i % y == 0) {
                    isPrime = false;
                }
                y++;
            }

            //if i is a prime number, print it
            if (isPrime) {
                System.out.println(i);
            }

            /*

            Prime numbers between 20-100 are:
            2, 3, 5, 7, 11, 13, 17, 19,
            23, 29, 31, 37, 41, 43, 47,
            53, 59, 61, 67, 71, 73, 79
            83, 89, 97.

            */

        }

    }


}

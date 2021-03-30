public class HarmonicSeries {

    public static void main(String[] args) {

        long n = 144;
        double sum = 0;

        for (double i = 1; i <= n; i++) {
            sum += 1/i;
        }

        System.out.println("For the given number " + n + ", the sum of the harmonic series up to n is: " + sum);
    }
}

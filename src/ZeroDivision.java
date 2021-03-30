public class ZeroDivision {

    public static void main(String[] args) {

        float x = 5.2f;
        float y = 0;

        if (y == 0) {
            //Informative message about division with 0
            System.out.println("The divider is zero, division cannot be done!");
        } else {
            System.out.println("Division result: " + x / y);
        }

    }
}

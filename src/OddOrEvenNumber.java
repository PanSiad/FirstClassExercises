public class OddOrEvenNumber {

    public static void main(String[] args) {
        int a = -5;

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

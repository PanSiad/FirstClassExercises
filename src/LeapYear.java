public class LeapYear {

    public static void main(String[] args) {

        //years sample
        int[] years = {1600, 1800, 2000, 2020, 2024, 2017, 1821, 1900};

        for (int year : years
             ) {
            //check whether a year is leap or not
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a leap year!");
            }
        }

    }

}

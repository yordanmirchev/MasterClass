package firstLessons;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        System.out.println(getDaysInMonth(1, 2020)); //→should return 31 since January has 31 days.
        System.out.println(getDaysInMonth(2, 2020)); //→should return 29 since February has 29 days in a leap year and 2020 is a leap year.
        System.out.println(getDaysInMonth(2, 2018)); //→should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
        System.out.println(getDaysInMonth(-1, 2020));// →should return -1 since the parameter month is invalid.
        System.out.println(getDaysInMonth(1, -2020));// →should return -1 since the parameter year is outside the range of 1 to 9999.


    }

    public static boolean isLeapYear(int year) {
        if ((year >= 1 && year <= 9999) &&
                ((year % 4 == 0 && year % 100 == 0 && year % 400 == 0) ||
                        (year % 4 == 0 && year % 100 != 0))) {
            return true;
        }

        return false;
    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;

            default -> 0;
        };

        return days;
    }
}

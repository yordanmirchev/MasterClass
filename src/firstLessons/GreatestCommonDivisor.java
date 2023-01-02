package firstLessons;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15)); //should return 5 since both can be divided by 5 without a remainder
        System.out.println(getGreatestCommonDivisor(12, 30)); //should return 6 since both can be divided by 6 without a remainder
        System.out.println(getGreatestCommonDivisor(9, 18)); //should return -1 since the first parameter is < 10
        System.out.println(getGreatestCommonDivisor(81, 153)); //should return 9 since both can be divided by 9 without a remainder

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int greatestCommonDivisor = 1;

        if (first < 10 || second < 10) {
            return -1;
        }

        int smaller_number = first > second ? second : first;

        int i = 1;
        do {
            if (first % i == 0 && second % i == 0) {
                greatestCommonDivisor = i;
            }
            i++;
        }
        while (i <= smaller_number);

        return greatestCommonDivisor;
    }

    /*
    Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
The method should return the greatest common divisor of the two numbers (int).
The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).

For example 12 and 30:
12 can be divided by 1, 2, 3, 4, 6, 12
30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30

The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.

HINT: Use a while or a for loop and check if both numbers can be divided without a remainder.
HINT: Find the minimum of the two numbers.
     */
}

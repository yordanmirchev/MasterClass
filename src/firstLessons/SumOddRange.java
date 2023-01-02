package firstLessons;

public class SumOddRange {
    /*

    Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.

    The method should use a for loop to sum all odd numbers in that range including the end and return the sum.

    It should call the method isOdd to check if each number is odd.

    The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.

    If those conditions are not satisfied return -1 from the method to indicate invalid input.

    TIP: use the remainder operator to check if the number is odd
    * */
    public static void main(String[] args) {

        System.out.println(sumOdd(1, 100));// → should return 2500
        System.out.println(sumOdd(-1, 100));// → should return -1
        System.out.println(sumOdd(100, 100));// → should return 0
        System.out.println(sumOdd(13, 13));// → should return 13 (This set contains one number, 13, and it is odd)
        System.out.println(sumOdd(100, -100));// → should return -1
        System.out.println(sumOdd(100, 1000));

    }

    public static int sumOdd(int start, int end) {
        int sum = 0;

        if (start < 0 || end < 0 || start > end) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isOdd(int n) {
        return n > 0 && n % 2 != 0;
    }

}

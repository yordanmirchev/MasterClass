package firstLessons;

public class NumberPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221)); //→ should return true
        System.out.println(isPalindrome(707));// → should return true
        System.out.println(isPalindrome(11212)); //→ should return false because reverse is 21211 and that is not equal to 11212.

    }

    public static boolean isPalindrome(int number) {
        int initial = number > 0 ? number : Math.abs(number);
        int reverse = 0;
        int lastDigit = 0;

        do {
            lastDigit = initial % 10;
            reverse *= 10;
            reverse += lastDigit;
            initial /= 10;
        }
        while (initial >= 1) ;

        return Math.abs(number) == reverse;
    }
}

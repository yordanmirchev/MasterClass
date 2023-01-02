package firstLessons;

public class LastDigitChecker {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71)); //→ should return true since 1 is the rightmost digit in numbers 41 and 71
        System.out.println(hasSameLastDigit(23, 32, 42)); //→ should return true since 2 is the rightmost digit in numbers 32 and 42
        System.out.println(hasSameLastDigit(9, 99, 999)); //→ should return false since 9 is not within the range of 10-1000

        System.out.println(isValid(10)); //→ should return true since 10 is within the range of 10-1000
        System.out.println(isValid(468)); //→ should return true since 468 is within the range of 10-1000
        System.out.println(isValid(1051)); //→ should return false since 1051 is not within the range of 10-1000

    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {

        if (isValid(n1) && isValid(n2) && isValid(n3)) {
            n1 = n1 % 10;
            n2 = n2 % 10;
            n3 = n3 % 10;

            if (n1 == n2 || n1 == n3 || n2 == n3) {
                return true;
            }
        }

        return false;
    }

    public static boolean isValid(int n) {
        if (n >= 10 && n <= 1000) {
            return true;
        }
        return false;
    }

}

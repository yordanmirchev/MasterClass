public class SumOfDigits {

    public static void main(String[] args) {

        System.out.println(sumOfDigits(1));
        System.out.println(sumOfDigits(10));
        System.out.println(sumOfDigits(11));
        System.out.println(sumOfDigits(123));
        System.out.println(sumOfDigits(1234));

    }

    public static int sumOfDigits(int n) {
        if (n < 0) {
            return -1;
        }

        int result = 0;

        if (n < 10) {
            result = n;
        } else {
            int d = n;
            while (d >= 10) {
                result += d % 10;
                d = d / 10;

            }

            result += d;
        }

        return result;
    }
}

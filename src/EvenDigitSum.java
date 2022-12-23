public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789)); //→ should return 20 since 2 + 4 + 6 + 8 = 20
        System.out.println(getEvenDigitSum(252)); //→ should return 4 since 2 + 2 = 4
        System.out.println(getEvenDigitSum(-22)); //→ should return -1 since the number is negative
    }

    /*Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
*/

    public static int getEvenDigitSum(int num) {

        if (num < 0) {
            return -1;
        }

        int sum = 0;

        do {
            int temp = num % 10;
            sum += temp % 2 == 0 ? temp : 0;
            num /= 10;
        } while (num > 1);

        return sum;
    }
}

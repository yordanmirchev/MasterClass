public class SharedDigit {
    public static void main(String[] args) {


        System.out.println(hasSharedDigit(12, 23));// → should return true since the digit 2 appears in both numbers
        System.out.println(hasSharedDigit(9, 99)); //→ should return false since 9 is not within the range of 10-99
        System.out.println(hasSharedDigit(15, 55)); //→ should return true since the digit 5 appears in both numbers
        System.out.println(hasSharedDigit(12, 43)); //→ should return false
        System.out.println(hasSharedDigit(12, 13)); //→ should return true

    }

    public static boolean hasSharedDigit(int num1, int num2) {

        if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) {
            int n11 = num1 / 10;
            int n12 = num1 % 10;
            int n21 = num2 / 10;
            int n22 = num2 % 10;

            if ((n11 == n21) || (n11 == n22) || (n12 == n21) || (n12 == n22)) {
                return true;
            }
        }
        return false;
    }

}

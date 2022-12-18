public class PositiveNegativeZero {
    public static void main(String[] args) {

        checkNumber(0);
        checkNumber(-1);
        checkNumber(1);
    }

    public static void checkNumber(int n) {
        System.out.println(n < 0 ? "negative" : (n == 0 ? "zero" : "positive"));
    }
}

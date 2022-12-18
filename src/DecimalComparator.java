public class DecimalComparator {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
        System.out.println(areEqualByThreeDecimalPlaces(3.174, 3.175));

    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        int f1 = (int) (first * 1000);
        int f2 = (int) (second * 1000);

        int dif = f1 > f2 ? f1 - f2 : f2 - f1;

        return dif < 1;
    }
}

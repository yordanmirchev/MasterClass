package firstLessons;

public class LengthConverter {

    static double INCH_TO_CM = 2.54;

    public static void main(String[] args) {

    }

    public static double convertToCentimeters(int inches) {
        return inches * INCH_TO_CM;

    }

    public static double convertToCentimeters(int feet, int inches) {

        int totalInches = 12 * feet + inches;

        return convertToCentimeters(totalInches);
    }
}

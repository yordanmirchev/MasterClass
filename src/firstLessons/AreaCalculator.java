package firstLessons;

public class AreaCalculator {

    public static void main(String[] args) {

    }

    public static double area(double radius) {
        return radius >= 0.0 ? radius * radius * Math.PI : -1.0;
    }

    public static double area(double a, double b) {
        return (a >= 0.0 && b >= 0.0) ? a * b : -1.0;
    }

}

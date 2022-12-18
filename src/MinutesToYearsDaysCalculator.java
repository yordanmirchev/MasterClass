public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {

        printYearsAndDays(525600); //  → should print "525600 min = 1 y and 0 d"
        printYearsAndDays(1051200); // → should print "1051200 min = 2 y and 0 d"
        printYearsAndDays(561600);   //→ should print "561600 min = 1 y and 25 d"
    }

    public static void printYearsAndDays(long minutes) {
        System.out.println(minutes < 0 ? "Invalid Value" : minutes + " min = " +
                (int) minutes / (60 * 24 * 365) + " y and " +
                ((int) minutes / (60 * 24)) % 365 + " d");
    }
}

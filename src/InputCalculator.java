import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        long avg = 0;
        int number = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {

            try {
                number = scanner.nextInt();
                sum += number;
                count += 1;
                avg = Math.round((double) sum / count);

            } catch (Exception e) {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }

}

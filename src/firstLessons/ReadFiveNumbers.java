package firstLessons;

import java.util.Scanner;

public class ReadFiveNumbers {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i < 6; i++) {
            int number = 0;
            do {
                number = readInt(i);
            }
            while (number < 0);
            sum += number;
        }

        System.out.println("The total is: " + sum);

    }

    public static int readInt(int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number #" + n + " :");
        int result = 0;
        try {
            result = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid number.");
            return -1;
        }
        return result;
    }
}

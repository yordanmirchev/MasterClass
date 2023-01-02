package firstLessons;

import java.util.Scanner;

public class MinMaxChalange {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = -1;
        int number = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter number!");

            try {
                number = scanner.nextInt();
                min = number < min ? number : min;
                max = number > max ? number : max;

            } catch (Exception e) {
                System.out.println("Min number: " + min + ", maximum number: " + max);
                break;
            }
        }

    }
}

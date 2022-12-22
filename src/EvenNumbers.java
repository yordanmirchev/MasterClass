public class EvenNumbers {

    public static void main(String[] args) {
        int starting_number = 4;
        int finalNumber = 20;

        int total_even = 0;
        int total_odd = 0;

        int max_total_even = 5;

        while (starting_number <= finalNumber && total_even < max_total_even) {
            starting_number++;
            if (isEven(starting_number)) {
                System.out.println(starting_number + " is even.");
                total_even++;
            } else {
                total_odd++;
            }

        }
        System.out.println("\nTotal even numbers: " + total_even + "\nTotal odd numbers: " + total_odd);
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}

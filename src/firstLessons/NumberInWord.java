package firstLessons;

public class NumberInWord {

    public static void main(String[] args) {


        for (int i = -1; i < 11; i++) {
            printNumberInWord(i);
        }
    }

    public static void printNumberInWord(int num) {
        String word =
                switch (num) {
                    case 0 -> "ZERO";
                    case 1 -> "ONE";
                    case 2 -> "TWO";
                    case 3 -> "THREE";
                    case 4 -> "FOUR";
                    case 5 -> "FIVE";
                    case 6 -> "SIX";
                    case 7 -> "SEVEN";
                    case 8 -> "EIGHT";
                    case 9 -> "NINE";
                    default -> "other";

                };

        System.out.println(word);
    }
}

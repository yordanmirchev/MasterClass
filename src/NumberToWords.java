public class NumberToWords {
    public static void main(String[] args) {


//Example Input/Output - getDigitCount method
        System.out.println(getDigitCount(0)); //should return 1 since there is only 1 digit
        System.out.println(getDigitCount(123)); //should return 3
        System.out.println(getDigitCount(-12)); //should return -1 since the parameter is negative
        System.out.println(getDigitCount(5200)); //should return 4 since there are 4 digits in the number
        System.out.println("\n");
//Example Input/Output - reverse method
        System.out.println(reverse(-121)); //should  return -121
        System.out.println(reverse(1212)); //should return  2121
        System.out.println(reverse(1234)); //should return 4321
        System.out.println(reverse(100)); //should return 1

        System.out.println("\n");
//Example Input/Output - numberToWords method
        numberToWords(123);
        System.out.println("\n");//should print "One Two Three".
        numberToWords(1010); //should print "One Zero One Zero".
        System.out.println("\n");
        numberToWords(1000); //should print "One Zero Zero Zero".
        System.out.println("\n");
        numberToWords(-12); //should print "Invalid Value" since the parameter is negative.

        System.out.println("\n");
        numberToWords(1234567890);


    }

    public static void numberToWords(int number) {
        int initial_digits = getDigitCount(number);
        int revered_digits = getDigitCount(reverse(number));
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            number = reverse(number);
            do {
                int digit = 0;

                digit = number % 10;

                String word_digit = switch (digit) {
                    case 0 -> "Zero";
                    case 1 -> "One";
                    case 2 -> "Two";
                    case 3 -> "Three";
                    case 4 -> "Four";
                    case 5 -> "Five";
                    case 6 -> "Six";
                    case 7 -> "Seven";
                    case 8 -> "Eight";
                    case 9 -> "Nine";
                    default -> "";
                };

                System.out.println(word_digit);

                number /= 10;

            }
            while (number > 0);
        }
        for (int i = 0; i < initial_digits - revered_digits; i++) {
            System.out.println("Zero");
        }

    }

    public static int reverse(int number) {
        int reversed = 0;

        do {
            reversed += number % 10;
            if (Math.abs(number) > 1) {
                reversed *= 10;
            }
            number /= 10;
        }
        while (Math.abs(number) > 0);

        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int digits = 0;

        do {
            number /= 10;
            digits++;
        } while (number > 0);

        return digits;
    }

}

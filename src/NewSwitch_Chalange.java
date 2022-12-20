public class NewSwitch_Chalange {
    public static void main(String[] args) {

        classicNatoAbc('a');
        enchancedNatoAbc('a');
        classicNatoAbc('C');
        enchancedNatoAbc('C');
        classicNatoAbc('?');
        enchancedNatoAbc('?');

        System.out.println("\n\n");

        for (int i = 0; i < 9; i++) {
            printDayOfWeek(i);
        }

    }

    public static void classicNatoAbc(char ch) {

        switch (Character.toUpperCase(ch)) {
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                System.out.println("C is charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is easy");
                break;
            default:
                System.out.println("Letter " + ch + " was not found in the switch");
                break;
        }

    }

    public static void enchancedNatoAbc(char ch) {

        switch (Character.toUpperCase(ch)) {
            case 'A' -> System.out.println("A is able");
            case 'B' -> System.out.println("B is baker");
            case 'C' -> System.out.println("C is charlie");
            case 'D' -> System.out.println("D is dog");
            case 'E' -> System.out.println("E is easy");
            default -> System.out.println("Letter " + ch + " was not found in the switch");
        }

    }

    public static void printDayOfWeek(int day) {

        String dayOfWeek =
                switch (day) {
                    case 1 -> "Monday";
                    case 2 -> "Tuesday";
                    case 3 -> "Wednesday";
                    case 4 -> "Thursday";
                    case 5 -> "Friday";
                    case 6 -> "Saturday";
                    case 7 -> "Sunday";
                    default -> "invalid";
                };

        System.out.println(day + " is " + dayOfWeek + " day of the week.");

    }
}

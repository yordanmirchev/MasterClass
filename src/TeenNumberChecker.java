public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(1, 2 , 3));
    }

    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int a) {
        return (a >= 13 && a <= 19);
    }
}

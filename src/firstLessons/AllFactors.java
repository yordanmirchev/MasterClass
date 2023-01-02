package firstLessons;

public class AllFactors {
    public static void main(String[] args) {
        printFactors(6); //→ should print 1 2 3 6
        printFactors(32); //→ should print 1 2 4 8 16 32
        printFactors(10); //→ should print 1 2 5 10
        printFactors(-1); //→ should print "Invalid Value" since number is < 1
    }

    public static void printFactors(int n) {
        if (n < 1) {
            System.out.println("Invalid Value");
        } else {
            int i = 1;
            do {
                if (n % i == 0) {
                    System.out.println(i);
                }
                i++;
            } while (i <= n);
        }
    }

}

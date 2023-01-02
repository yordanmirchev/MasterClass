package firstLessons;

public class Sum3And5 {

    public static void main(String[] args) {

        int total_sum=0;
        int total_count=0;

        for (int i = 1 ; i <=1000  && total_count < 5; i++){
            if (i%3 ==0 && i %5 ==0){
                System.out.println("Number " + i + " is divisible by 3 and 5.");

                total_sum += i;
                total_count++;
            }
        }

        System.out.println("\nTotal sum of the numbers: " + total_sum);
    }
}

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static void main(String[] args) {

        List<Integer> primes = new ArrayList<>();
        int max_primes = 3;
        int upperRange = 20;

        for (int i = 0 ; i<= upperRange ; i++){
        if(isPrime(i)){
            System.out.println("Number " +i + " is prime number.");
            primes.add(i);
        }
        else {
            System.out.println("Number " + i + " is not prime number.");
        }

            if (primes.size() == max_primes){
                break;
            }

        }

        System.out.println("\nPrinting the first " + max_primes + " primes bellow " + upperRange +  " :" + primes );

    }

    public static boolean isPrime(int number){

        if (number >= 2) {

        for (int d = 2 ; d< number; d++){
            if (number % d ==0) {

                return false;
            }
        }

            return true;
        }

        return false;
    }
}

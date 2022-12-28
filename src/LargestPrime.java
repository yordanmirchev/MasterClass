import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class LargestPrime {
    public static void main(String[] args) {
        test();

    }

    @Test
    public static void test() {
        assertEquals(getLargestPrime(21), 7);
        assertEquals(getLargestPrime(217), 31);
        assertEquals(getLargestPrime(0), -1);
        assertEquals(getLargestPrime(45), 5);
        assertEquals(getLargestPrime(-1), -1);
    }


    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                number /= i;

                //we start from same position
                i--;
            }
        }
        return number;
    }

    /*
    *Write a method named getLargestPrime with one parameter of type int named number.
If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
The method should calculate the largest prime factor of a given number and return it.

getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
getLargestPrime (0); should return -1 since 0 does not have any prime numbers
getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
getLargestPrime (-1); should return -1 since the parameter is negative


HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.


     */

}

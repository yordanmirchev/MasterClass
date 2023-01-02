package firstLessons;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class FlourPackProblem {
    public static void main(String[] args) {
        test();
    }

    @Test
    public static void test() {
        assertFalse(canPack(1, 0, 4));
        assertTrue(canPack(1, 0, 5));
        assertTrue(canPack(0, 5, 4));
        assertTrue(canPack(2, 2, 11));
        assertFalse(canPack(-3, 2, 12));

        assertFalse(canPack(1, 0, 6));
        assertTrue(canPack(2, 1, 5));
        assertTrue(canPack(4, 18, 19));
        assertFalse(canPack(5, 3, 24));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            while (goal >= 5 && bigCount > 0) {
                goal -= 5;
                bigCount--;
            }

            return smallCount >= goal;
        }
        return false;
    }

}

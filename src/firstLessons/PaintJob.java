package firstLessons;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PaintJob {
    public static void main(String[] args) {
        test();
    }

    @Test
    public static void test() {

        assertEquals(getBucketCount(-3.4, 2.1, 1.5, 2), -1);
        assertEquals(getBucketCount(3.4, 2.1, 1.5, 2), 3);
        assertEquals(getBucketCount(2.75, 3.25, 2.5, 1), 3);

        assertEquals(getBucketCount(-3.4, 2.1, 1.5), -1);
        assertEquals(getBucketCount(3.4, 2.1, 1.5), 5);
        assertEquals(getBucketCount(7.25, 4.3, 2.35), 14);

        assertEquals(getBucketCount(3.4, 1.5), 3);
        assertEquals(getBucketCount(6.26, 2.2), 3);
        assertEquals(getBucketCount(3.26, 0.75), 5);


    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0) {
            return (int) Math.ceil(width * height / areaPerBucket) - extraBuckets;
        }
        return -1;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
       return getBucketCount(area, 1, areaPerBucket);
    }
}

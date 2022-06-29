package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static java.util.stream.IntStream.rangeClosed;

// https://www.codewars.com/kata/55ecd718f46fba02e5000029/train/java

public class Kata35 {
    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, InBetweenArray.between(1, 4));
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2}, InBetweenArray.between(-2, 2));
    }
}

class InBetweenArray {
    public static int[] between(int a, int b) {
        return rangeClosed(a, b).toArray();
    }
}

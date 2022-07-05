package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import java.util.TreeSet;
import java.util.stream.*;

// https://www.codewars.com/MergingSortedIntegerArrays/573f5c61e7752709df0005d2/train/java

public class Kata44 {
    @Test
    public void basicTest() {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, MergingSortedIntegerArrays.mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }));
        assertArrayEquals(new int[] { 2, 4, 6, 8 }, MergingSortedIntegerArrays.mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 }));
    }
}

class MergingSortedIntegerArrays {
    public static int[] mergeArrays(int[] first, int[] second) {
        // return IntStream.concat(IntStream.of(first),IntStream.of(second)).distinct().sorted().toArray();
        TreeSet<Integer> ts = new TreeSet<Integer>();
        for (int x : first) {
            ts.add(x);
        }
        for (int y : second) {
            ts.add(y);
        }
        return ts.stream().mapToInt(Integer::intValue).toArray();
    }
}

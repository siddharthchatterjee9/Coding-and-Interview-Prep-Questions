package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata50 {
    @Test
    public void basicTests() {
        assertArrayEquals("should return the first 3 items", new int[]{0, 1, 2}, TakeFirstNElements.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3));
    }
}

class TakeFirstNElements {
    public static int[] take(int[] arr, int n) {
        /* List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }
        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        return result; */
        return n > arr.length ? arr : Arrays.copyOf(arr, n);
    }
}
package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;

// https://www.codewars.com/kata/576b93db1129fcf2200001e6/train/java
// S. Chatterjee

public class Kata33 {
    @Test
    public void BasicTests() {
        assertEquals(16, SumWithoutMinAndMax.sum(new int[] { 6, 2, 1, 8, 10}));
    }
}

class SumWithoutMinAndMax {
    public static int sum(int[] numbers) {
        int sum = 0;
        if (numbers == null || numbers.length < 3) {
            return 0;
        }
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
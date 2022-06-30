package kyu8;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

// https://www.codewars.com/kata/55edaba99da3a9c84000003b/train/java

public class Kata37 {
    @Test public void testSimple() {
        assertArrayEquals(new int[] {2,4,6}, EvenNumbers.divisibleBy(new int[] {1,2,3,4,5,6},2));
        assertArrayEquals(new int[] {3,6}, EvenNumbers.divisibleBy(new int[] {1,2,3,4,5,6},3));
        assertArrayEquals(new int[] {0,4}, EvenNumbers.divisibleBy(new int[] {0,1,2,3,4,5,6},4));
    }
}
class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        // return Arrays.stream(numbers).filter(i -> (i % divider) == 0).toArray();
        int[] divisible = new int[numbers.length];
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                divisible[k] = numbers[i];
                k++;
            }
        }
        return Arrays.copyOf(divisible, k);
    }
}
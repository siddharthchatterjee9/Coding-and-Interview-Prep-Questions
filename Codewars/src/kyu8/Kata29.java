package kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

// https://www.codewars.com/kata/576bb71bbbcf0951d5000044/train/java

public class Kata29 {
    @Test
    public void countPositivesSumNegatives_BasicTest() {
        int[] expectedResult = new int[] {10, -65};
        assertArrayEquals(expectedResult, CountPositivesSumNegatives.countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }

    @Test
    public void countPositivesSumNegatives_InputWithZeroes() {
        int[] expectedResult = new int[] {8, -50};
        assertArrayEquals(expectedResult, CountPositivesSumNegatives.countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }
}
class CountPositivesSumNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[] {};
        }
        else {
            int[] array = new int[2];
            array[0] = 0;
            array[1] = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    array[0]++;
                }
                else if (input[i] < 0) {
                    array[1] += input[i];
                }
            }
            return array;
        }
    }
}
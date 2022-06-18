package kyu8;

import java.lang.Math;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;

/* https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/train/java */
// Code written by Siddharth Chatterjee
// Might look stupid at first glance, but I got it right! :)

public class Kata16 {
    @Test
    public void testSomething() {

        int[] input = new int[] {-1,-2,-3,-4,-5};
        int[] expected = new int[] {1,2,3,4,5};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));

        input = new int[] {-1,2,-3,4,-5};
        expected = new int[] {1,-2,3,-4,5};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));

        input = new int[] {};
        expected = new int[] {};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));

        input = new int[] {0};
        expected = new int[] {0};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));
    }
}

class InvertValues {
    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] = Math.negateExact(array[i]);
            }
            else if (array[i] < 0) {
                array[i] = Math.negateExact(array[i]);
            }
        }
        return array;
    }
}
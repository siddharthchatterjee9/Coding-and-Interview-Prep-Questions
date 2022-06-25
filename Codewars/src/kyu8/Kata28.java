package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

// https://www.codewars.com/LarioAndMuigi/56b29582461215098d00000f/train/java

public class Kata28 {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, LarioAndMuigi.pipeFix(new int[] {1,2,3,5,6,8,9}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, LarioAndMuigi.pipeFix(new int[] {1,2,3,12}));
        assertArrayEquals(new int[] {6,7,8,9}, LarioAndMuigi.pipeFix(new int[] {6,9}));
        assertArrayEquals(new int[] {-1,0,1,2,3,4}, LarioAndMuigi.pipeFix(new int[] {-1,4}));
        assertArrayEquals(new int[] {1,2,3}, LarioAndMuigi.pipeFix(new int[] {1,2,3}));
    }
}

class LarioAndMuigi {
    public static int[] pipeFix(int[] numbers) {
        int min = numbers[0];
        int max = numbers[numbers.length-1];
        int size = max - min + 1;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = min;
            min += 1;
        }
        return array;
    }
}
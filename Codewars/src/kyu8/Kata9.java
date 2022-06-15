package kyu8;

import java.util.stream.IntStream;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Kata9 {
        @Test
        public void sampleTests() {
            assertEquals(21, ArrayPlusArray.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
            assertEquals(-21, ArrayPlusArray.arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
            assertEquals(15, ArrayPlusArray.arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
            assertEquals(2100, ArrayPlusArray.arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
        }
}

class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }
}
package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Kata10 {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1},Sequence.reverse(5));
    }
}

class Sequence{
    public static int[] reverse(int n) {
        int[] array = new int[n];
        for (int i = n; i > 0; i--) {
            array[n-i] = i;
        }
        return array;
    }

}


package kyu8;

import org.junit.Test;
import java.lang.Math;
import static org.junit.Assert.assertArrayEquals;

// https://www.codewars.com/kata/57a083a57cb1f31db7000028/train/java
// S. Chatterjee

public class Kata38 {
    @Test
    public void testSomething() {
        assertArrayEquals(new long[]{1}, PowersOfTwo.powersOfTwo(0));
        assertArrayEquals(new long[]{1,2}, PowersOfTwo.powersOfTwo(1));
        assertArrayEquals(new long[]{1,2,4,8,16}, PowersOfTwo.powersOfTwo(4));
    }
}

class PowersOfTwo {
    public static long[] powersOfTwo(int n){
        long[] result = new long[n+1];
        for (int i = 0; i <= n; i++) {
            result[i] = (long) Math.pow(2, i);
        }
        return result;
    }
}
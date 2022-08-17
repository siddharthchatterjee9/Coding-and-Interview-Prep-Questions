package kyu8;

// https://www.codewars.com/kata/55dc4520094bbaf50e0000cb/train/java

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata55 {
    @Test
    public void test1() {
        assertEquals(false, WilsonPrime.am_i_wilson(0));
    }
    @Test
    public void test2() {
        assertEquals(false, WilsonPrime.am_i_wilson(1));
    }
    @Test
    public void test3() {
        assertEquals(true, WilsonPrime.am_i_wilson(5));
    }
}

class WilsonPrime {
    public static boolean am_i_wilson(double n) {
        int p = 0;
        if (n > 1) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i != 0) {
                    p = (int) n;
                }
                else {
                    return false;
                }
            }
        }
        int factorial = 1;
        for (int i = 1; i <= p - 1; i++) {
            factorial *= i;
        }
        if (p != 0) {
            int cond1 = factorial + 1;
            int cond2 = p * p;
            if ((cond1 / cond2) % 1 == 0) {
                return true;
            }
        }
        return false;
    }
}
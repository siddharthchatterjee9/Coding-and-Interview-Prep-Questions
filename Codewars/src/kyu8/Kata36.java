package kyu8;

import static org.junit.Assert.*;
import org.junit.Test;

// https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1/train/java
// S. Chatterjee

public class Kata36 {
    @Test
    public void test1() {
        assertEquals(5, CharProblem.howOld("5 years old"));
    }
    @Test
    public void test2() {
        assertEquals(9, CharProblem.howOld("9 years old"));
    }
    @Test
    public void test3() {
        assertEquals(1, CharProblem.howOld("1 year old"));
    }
}

class CharProblem {
    public static int howOld(final String herOld) {
        String age = String.valueOf(herOld.charAt(0));
        return Integer.parseInt(age);
    }
}
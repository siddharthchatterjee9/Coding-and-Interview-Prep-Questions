package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// https://www.codewars.com/kata/57eae65a4321032ce000002d/train/java

public class Kata21 {
    @Test
    public void testSomething() {
        FakeBinary fakeBinary = new FakeBinary();
        assertEquals("01011110001100111", fakeBinary.fakeBin("45385593107843568"));
        assertEquals("101000111101101", fakeBinary.fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011", fakeBinary.fakeBin("366058562030849490134388085"));
    }
}

class FakeBinary {
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[1-4]", "0").replaceAll("[^0]", "1");
    }
}
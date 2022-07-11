package kyu8;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.*;

// https://www.codewars.com/kata/557af9418895e44de7000053/train/java

public class Kata47 {
    @Test
    public void testStar() {
        repeatTest("*", 3, "***");
    }

    @Test
    public void testHello() {
        repeatTest("Hello", 11, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello");
    }

    public void repeatTest(final Object toRepeat, final int n, final String expected) {
        final String testMessage = String.format("Testing with toRepeat = %s and n = %d", toRepeat, n);
        assertEquals(testMessage,  expected, RepeatIt.repeatString(toRepeat, n));
    }
}

class RepeatIt {
    public static String repeatString(final Object toRepeat, final int n) {
        StringBuilder sb = new StringBuilder();
        if (! (toRepeat instanceof String)) {
            return "Not a string";
        }
        for (int i = 1; i <= n; i++) {
            sb.append(toRepeat);
        }
        return sb.toString();
    }

}
package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/57faf7275c991027af000679/train/java

public class Kata22 {
    @Test
    public void fixedTests() {
        // assertEquals("expected", "actual");
        assertEquals("Hi", ExclamationMark.remove("Hi!", 1));
        assertEquals("Hi", ExclamationMark.remove("Hi!", 100));
        assertEquals("Hi!!", ExclamationMark.remove("Hi!!!", 1));
        assertEquals("Hi", ExclamationMark.remove("Hi!!!", 100));
        assertEquals("Hi", ExclamationMark.remove("!Hi", 1));
        assertEquals("Hi!", ExclamationMark.remove("!Hi!", 1));
        assertEquals("Hi", ExclamationMark.remove("!Hi!", 100));
        assertEquals("!!Hi !!hi!!! !hi", ExclamationMark.remove("!!!Hi !!hi!!! !hi", 1));
        assertEquals("Hi !!hi!!! !hi", ExclamationMark.remove("!!!Hi !!hi!!! !hi", 3));
        assertEquals("Hi hi!!! !hi", ExclamationMark.remove("!!!Hi !!hi!!! !hi", 5));
        assertEquals("Hi hi hi", ExclamationMark.remove("!!!Hi !!hi!!! !hi", 100));
    }
}

class ExclamationMark {
    public static String remove(String s, int n) {
        while (n > 0) {
            s = s.replaceFirst("[!]", "");
            n--;
        }
        return s;
    }
}

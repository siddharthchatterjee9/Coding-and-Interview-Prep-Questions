package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata3 {
    @Test
    public void evenTests() {
        assertEquals("es", Kata.getMiddle("test"));
        assertEquals("dd", Kata.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", Kata.getMiddle("testing"));
        assertEquals("A", Kata.getMiddle("A"));
    }
}

class Kata {
    public static String getMiddle(String word) {
        /* S.Chatterjee */
        if (word.length() % 2 != 0) {
            return word.substring(word.length() / 2, word.length() / 2 + 1);
        }
        else if (word.length() % 2 == 0) {
            return word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
        }
        else {
            return null;
        }
    }
}
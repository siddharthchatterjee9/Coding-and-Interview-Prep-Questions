package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java

public class Kata6 {
    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReversedWords.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", ReversedWords.reverseWords("apple"));
        assertEquals("a b c d", ReversedWords.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", ReversedWords.reverseWords("double  spaced  words"));
    }
}

class ReversedWords {
    public static String reverseWords(final String original) {
        String[] array = original.split(" ");
        if (array.length == 0) {
            return original;
        }
        else {
            int i = 0;
            for (String s : array) {
                array[i] = new StringBuilder(s).reverse().toString();
                i++;
            }
            return String.join(" ", array);
        }
    }
}
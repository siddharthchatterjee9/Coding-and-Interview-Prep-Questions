package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

// https://www.codewars.com/kata/5704aea738428f4d30000914/train/java

public class Kata41 {
    @Test
    public void tests() {
        assertEquals("ttlheoiscstk", TripleTrouble.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", TripleTrouble.tripleTrouble("aa","bb","cc"));
        assertEquals("Batman", TripleTrouble.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", TripleTrouble.tripleTrouble("LLh","euo","xtr"));
    }
}

class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        return range(0, one.length()).mapToObj(i -> "" + one.charAt(i) + two.charAt(i) + three.charAt(i)).collect(joining());
    }
}
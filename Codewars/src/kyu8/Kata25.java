package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

// https://www.codewars.com/kata/57cfdf34902f6ba3d300001e/train/java

public class Kata25 {
    @Test
    public void testFixed() {
        assertEquals("b***i***t***c***o***i***n", SortAndStar.twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        assertEquals("a***r***e", SortAndStar.twoSort(new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }
}

class SortAndStar {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        char[] c = s[0].toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < c.length - 1; i++) {
            sb.append(String.valueOf(c[i]));
            sb.append("***");
        }
        sb.append(c[c.length-1]);
        return sb.toString();
    }
}
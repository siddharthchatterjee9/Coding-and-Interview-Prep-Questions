package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
// import org.apache.commons.lang3.StringUtils;

// https://www.codewars.com/kata/5865918c6b569962950002a1/train/java
// All Star Code Challenge #18

public class Kata14 {
    @Test
    public void testSomething() {
        assertEquals(1, CodeWars.strCount("Hello", 'o'));
        assertEquals(2, CodeWars.strCount("Hello", 'l'));
        assertEquals(0, CodeWars.strCount("",'z'));
    }
}

class CodeWars {
    public static int strCount(String str, char letter) {
        int count = 0;
        char[] array = str.toCharArray();
        for (char i : array) {
            if (i == letter) {
                count++;
            }
        }
        return count;
        // return StringUtils.countMatches(str, letter);
    }
}
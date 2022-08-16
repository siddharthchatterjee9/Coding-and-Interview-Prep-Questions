package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java

public class Kata54 {
    @Test
    public void testSomething1() {
        assertEquals(true, XO.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertEquals(true, XO.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertEquals(false, XO.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertEquals(false, XO.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertEquals(false, XO.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertEquals(true, XO.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertEquals(false, XO.getXO("Xxxxertr34"));
    }
}

class XO {
    public static boolean getXO (String str) {
        char[] array = str.toCharArray();
        int xCount = 0;
        int oCount = 0;
        for (char c : array) {
            if (c == 'x' || c == 'X') {
                xCount++;
            }
            else if (c == 'o' || c == 'O') {
                oCount++;
            }
        }
        if (xCount != oCount) {
            return false;
        }
        return true;
    }
}
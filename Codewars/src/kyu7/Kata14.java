package kyu7;

// https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata14 {
    @Test
    public void FixedTests() {
        assertEquals(true, Isogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, Isogram.isIsogram("Isogram"));
        assertEquals(false, Isogram.isIsogram("moose"));
        assertEquals(false, Isogram.isIsogram("isIsogram"));
        assertEquals(false, Isogram.isIsogram("aba"));
        assertEquals(false, Isogram.isIsogram("moOse"));
        assertEquals(true, Isogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Isogram.isIsogram(""));
    }
}

class Isogram {
    public static boolean isIsogram(String str) {
        return str.toLowerCase().chars().distinct().count() == str.length();
    }
}

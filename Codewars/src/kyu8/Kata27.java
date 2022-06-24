package kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

// https://www.codewars.com/kata/56efc695740d30f963000557/train/java

public class Kata27 {
    @Test
    public void fixedTests() {
        assertEquals("HELLO WORLD", UpperLower.toAlternativeString("hello world"));
        assertEquals("hello world", UpperLower.toAlternativeString("HELLO WORLD"));
        assertEquals("HELLO world", UpperLower.toAlternativeString("hello WORLD"));
        assertEquals("hEllO wOrld", UpperLower.toAlternativeString("HeLLo WoRLD"));
        assertEquals("Hello World", UpperLower.toAlternativeString(UpperLower.toAlternativeString("Hello World")));
        assertEquals("12345", UpperLower.toAlternativeString("12345"));
        assertEquals("1A2B3C4D5E", UpperLower.toAlternativeString("1a2b3c4d5e"));
    }

    @Test
    public void kataTitleTests() {
        assertEquals("ALTerNAtiNG CaSe", UpperLower.toAlternativeString("altERnaTIng cAsE"));
        assertEquals("altERnaTIng cAsE", UpperLower.toAlternativeString("ALTerNAtiNG CaSe"));
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", UpperLower.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", UpperLower.toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }
}

class UpperLower {
    public static String toAlternativeString(String string) {
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (Character.isLowerCase(array[i])) {
                array[i] = Character.toUpperCase(array[i]);
            }
            else if (Character.isUpperCase(array[i])) {
                array[i] = Character.toLowerCase(array[i]);
            }
        }
        return new String(array);
    }
}
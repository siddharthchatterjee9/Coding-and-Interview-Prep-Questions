package kyu7;

// https://www.codewars.com/kata/5f3142b3a28d9b002ef58f5e/train/java

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Kata12 {
    @Test
    public void exampleTests() {
        String[][] tests = {
                {"hello", "0.1.2.2.3"},
                {"heLlo", "0.1.2.2.3"},
                {"helLo", "0.1.2.2.3"},
                {"Hippopotomonstrosesquippedaliophobia", "0.1.2.2.3.2.3.4.3.5.3.6.7.4.8.3.7.9.7.10.11.1.2.2.9.12.13.14.1.3.2.0.3.15.1.13"},
        };
        for(String[] arr: tests)
            assertEquals(arr[1],Crypto.wordPattern(arr[0]));
    }
}

class Crypto {
    public static String wordPattern(final String word){
        if (word.length() != 0) {
            Map<Character, String> map = new HashMap<>();
            List<String> result = new ArrayList<>();
            for (char c : word.toLowerCase().toCharArray()) {
                String val = map.get(c);
                if (val == null) {
                    val = String.valueOf(map.size());
                    map.put(c, val);
                }
                result.add(val);
            }
            return result.stream().collect(Collectors.joining("."));
        }
        return null;
    }
}
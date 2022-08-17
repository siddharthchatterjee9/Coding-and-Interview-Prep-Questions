package _804_uniqueMorseCodeWords;

// https://leetcode.com/problems/unique-morse-code-words/

import java.util.HashSet;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<String>();

        String[] morse = new String[]{".-",   "-...", "-.-.", "-..",  ".",   "..-.", "--.",  "....", "..",
                ".---", "-.-",  ".-..", "--",   "-.",  "---",  ".--.", "--.-", ".-.",
                "...",  "-",    "..-",  "...-", ".--", "-..-", "-.--", "--.."};

        for (String word : words) {
            StringBuilder transformation = new StringBuilder();

            for (char c : word.toCharArray()) {
                transformation.append(morse[c-'a']);
            }
            set.add(transformation.toString());
        }
        return set.size();
    }

}

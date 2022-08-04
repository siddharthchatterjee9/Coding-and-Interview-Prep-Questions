package _387_firstUniqueCharacterInAString;

// https://leetcode.com/problems/first-unique-character-in-a-string/

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!map.containsKey(current)) {
                map.put(current, i);
            }
            else {
                map.put(current, -1);
            }
        }
        int first = Integer.MAX_VALUE;
        for (char c : map.keySet()) {
            if (map.get(c) > -1 && map.get(c) < first) {
                first = map.get(c);
            }
        }
        return first == Integer.MAX_VALUE ? -1 : first;
        /*
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }
        return -1;
         */
    }
}

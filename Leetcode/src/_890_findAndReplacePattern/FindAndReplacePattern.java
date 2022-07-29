package _890_findAndReplacePattern;

// https://leetcode.com/problems/find-and-replace-pattern/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        String p = normalize(pattern);
        List<String> ans = new ArrayList<>();

        for (String word : words) {
            if (p.equals(normalize(word))) {
                ans.add(word);
            }
        }
        return ans;
    }
    public String normalize(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int len = str.length();
        String ans = "";
        for (int i = 0; i < len; i++) {
            map.putIfAbsent(str.charAt(i), map.size());
            ans += map.get(str.charAt(i));
        }
        return ans;
    }

}
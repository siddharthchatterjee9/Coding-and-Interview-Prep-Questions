package _30_substringWithConcatenationOfAllWords;

// https://leetcode.com/problems/substring-with-concatenation-of-all-words/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<Integer>();
        int length = words[0].length(); //length of each word
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (int i = 0; i <= s.length() - length * words.length; i++) {
            Map<String, Integer> copyMap = new HashMap<String, Integer>(map);
            for (int j = 0; j < words.length; j++) {
                String str = s.substring(i + j * length, i + j * length + length);
                if (copyMap.containsKey(str)) {
                    int count = copyMap.get(str);
                    if (count == 1) {
                        copyMap.remove(str);
                    }
                    else {
                        copyMap.put(str, count - 1);
                    }
                    if (copyMap.isEmpty()) { //matches
                        ans.add(i);
                        break;
                    }
                }
                else {
                    break;
                }
            }
        }
        return ans;
    }

}

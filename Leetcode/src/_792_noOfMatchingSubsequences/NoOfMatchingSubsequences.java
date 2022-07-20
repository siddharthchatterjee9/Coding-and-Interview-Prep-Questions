package _792_noOfMatchingSubsequences;

// https://leetcode.com/problems/number-of-matching-subsequences/

class TrieNode {
    public TrieNode[] children = new TrieNode[26];
    public int count = 0;
}

public class NoOfMatchingSubsequences {
    public int numMatchingSubseq(String s, String[] words) {
        for (String word: words) {
            insert(word);
        }
        TrieNode root = null;
        return dfs(s, 0, root);
    }
    private void insert(final String word) {
        TrieNode root = null;
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (node.children[i] == null) {
                node.children[i] = new TrieNode();
            }
            node = node.children[i];
        }
        ++node.count;
    }
    private int dfs (String s, int i, TrieNode node) {
        int ans = node.count;
        if (i >= s.length()) {
            return ans;
        }
        for (int j = 0; j < 26; ++j) {
            if (node.children[j] != null) {
                int index = s.indexOf('a' + j, i);
                if (index != 1) {
                    ans += dfs(s, index + 1, node.children[j]);
                }
            }
        }
        return ans;
    }
}
/*
class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int result = 0;
        Map<Character, List<Pair<String, Integer>>> map = new HashMap<>();

        for (String word: words) {
            char c = word.charAt(0);

            List<Pair<String, Integer>> list = map.getOrDefault(c, new ArrayList<>());
            list.add(new Pair(word, 0));
            map.put(c, list);
        }

        for (char c: s.toCharArray()) {
            if (!map.containsKey(c)) {
                continue;
            }

            List<Pair<String, Integer>> list = map.get(c);
            List<Pair<String, Integer>> bufferList = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {
                Pair<String, Integer> pair = list.get(i);
                String word = pair.getKey();
                int index = pair.getValue();

                if (index == word.length() - 1) {
                    result++;
                } else {
                    char nextChar = word.charAt(index + 1);
                    Pair<String, Integer> newPair = new Pair(word, index + 1);
                    if (nextChar == c) {
                        bufferList.add(newPair);
                    } else {
                        List<Pair<String, Integer>> newCharList = map.getOrDefault(nextChar, new ArrayList<>());
                        newCharList.add(newPair);
                        map.put(nextChar, newCharList);
                    }

*/           /*     }
            }
            map.put(c, bufferList);
        }

        return result;
    }

*/
package _409_longestPalindrome;

// https://leetcode.com/problems/longest-palindrome/

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] char_frequencies = new int[128];
        for (char c : s.toCharArray()) {
            char_frequencies[c]++;
        }
        int result = 0;
        for (int char_freq : char_frequencies) {
            result += char_freq / 2 * 2;
            if (result % 2 == 0 && char_freq % 2 == 1) {
                result += 1;
            }
        }
        return result;
    }
}

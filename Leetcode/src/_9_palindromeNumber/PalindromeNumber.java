package _9_palindromeNumber;

// https://leetcode.com/problems/palindrome-number/

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String temp = Integer.toString(x);
        int[] result = new int[temp.length() + 1];
        for (int i = temp.length() - 1; i >= 0; i--) {
            result[i] = temp.charAt(i) - '0';
        }
        int new_number = 0;
        int multiplier = 1;
        for (int i = 0; i < result.length; i++) {
            new_number += multiplier * result[i];
            multiplier *= 10;
        }
        if (x == new_number) {
            return true;
        }
        return false;
    }
}

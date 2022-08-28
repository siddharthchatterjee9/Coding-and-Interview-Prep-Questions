package _869_reorderedPowerOfTwo;

// https://leetcode.com/problems/reordered-power-of-2/

import java.util.Arrays;

public class ReorderedPowerOfTwo {
    public boolean reorderedPowerOf2(int n) {
        // for a permutation p, keep on dividing by 2
        // if throughout the process the remainder is 0
        // and in the end we are left with 1
        // then yes, permutation p is a power of 2
        char[] number = sortedDigits(n);

        for (int i = 0; i < 30; ++i) {
            char[] powerOfTwo = sortedDigits(1 << i);
            if (Arrays.equals(number, powerOfTwo)) {
                return true;
            }
        }
        return false;
    }
    private char[] sortedDigits(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        Arrays.sort(digits);
        return digits;
    }
}

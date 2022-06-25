package kyu6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/514b92a657cdc65150000006/train/java
public class Kata2 {
    @Test
    public void test() {
        assertEquals(23, new Solution().solution(10));
    }
}

class Solution {
    public int solution(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 ==0 ) {
                sum += i;
            }
        }
        return sum;
    }
}
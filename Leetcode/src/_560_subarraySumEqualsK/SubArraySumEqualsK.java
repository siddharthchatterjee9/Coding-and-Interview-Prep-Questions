package _560_subarraySumEqualsK;

// https://leetcode.com/problems/subarray-sum-equals-k/

import java.util.HashMap;

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> arr_sums = new HashMap();
        // first Integer is current cumulative sum,
        // whereas the second Integer is the no. of times we have seen that sum
        arr_sums.put(0, 1);
        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (arr_sums.containsKey(sum-k)) {
                count += arr_sums.get(sum-k);
            }
            arr_sums.put(sum, arr_sums.getOrDefault(sum,0) + 1);
        }
        return count;
    }
}

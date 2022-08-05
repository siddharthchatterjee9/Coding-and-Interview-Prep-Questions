package _377_combinationSumIV;

// https://leetcode.com/problems/combination-sum-iv/

import java.util.Arrays;

public class CombinationSumIV {
    int[] dp; // TC = (N * target)
    public int combinationSum4(int[] nums, int target) {
        // actually permutation not combination
        dp = new int[target+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        return helper(nums, target); // count is in this
    }
    int helper(int[] nums, int target) {
        if (dp[target] > -1) {
            return dp[target];
        }
        int count = 0; // no of combinations
        for (int i : nums) {
            if (i <= target) {
                count += helper(nums, target - i); // recursive call
            }
        }
        dp[target] = count; //count was defined inside helper
        return dp[target];  //dp[target] has global scope
    }
}

package _53_maximumSubarray;

// https://leetcode.com/problems/maximum-subarray/

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        //Kadane's algorithm
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}

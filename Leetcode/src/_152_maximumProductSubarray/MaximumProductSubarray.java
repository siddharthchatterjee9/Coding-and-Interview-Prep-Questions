package _152_maximumProductSubarray;

// https://leetcode.com/problems/maximum-product-subarray/

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int curr_max_product = nums[0];
        int curr_min_product = nums[0];
        int ans = nums[0];
        int prev_max_product = nums[0];
        int prev_min_product = nums[0];
        for (int i = 0; i < nums.length; i++) {
            curr_max_product = Math.max(Math.max(prev_max_product * nums[i], prev_min_product * nums[i]), nums[i]);
            curr_min_product = Math.min(Math.min(prev_max_product * nums[i], prev_min_product * nums[i]), nums[i]);
            ans = Math.max(ans, curr_max_product);
            prev_max_product = curr_max_product;
            prev_min_product = curr_min_product;
        }
        return ans;
    }
}

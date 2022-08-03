package _704_binarySearch;

// https://leetcode.com/problems/binary-search/

public class BinarySearch {
    public int search(int[] nums, int target) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] == target) {
                return midpoint;
            }
            else if (nums[midpoint] < target) {
                left = midpoint + 1;
            }
            else {
                right = midpoint - 1;
            }
        }
        return -1;
    }
}

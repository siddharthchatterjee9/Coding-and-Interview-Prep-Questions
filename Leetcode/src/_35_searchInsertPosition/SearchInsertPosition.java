package _35_searchInsertPosition;

// https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
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
        return left;
    }
}

package _26_removeDuplicatesFromSortedArray;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[index++] = nums[i+1];
            }
        }
        return index;
    }
}

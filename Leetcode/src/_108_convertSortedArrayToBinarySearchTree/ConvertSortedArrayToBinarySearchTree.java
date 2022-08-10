package _108_convertSortedArrayToBinarySearchTree;

// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        if (nums.length == 0) {
            return null;
        }
        return constructBSTFromSortedArray(nums, 0, nums.length - 1);
    }
    public TreeNode constructBSTFromSortedArray(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int midpoint = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[midpoint]);
        node.left = constructBSTFromSortedArray(nums, left, midpoint - 1);
        node.right = constructBSTFromSortedArray(nums, midpoint + 1, right);
        // [-10,-3,0,5,9] => midpoint is 0
        return node;
    }
}

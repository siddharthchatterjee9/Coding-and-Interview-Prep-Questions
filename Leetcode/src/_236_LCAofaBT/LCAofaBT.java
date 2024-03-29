package _236_LCAofaBT;

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/submissions/

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class LCAofaBT {
    public TreeNode lowestCommonAncestor (TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p , q);

        if (l != null && r != null) {
            return root;
        }
        return l == null? r : l;
    }
}

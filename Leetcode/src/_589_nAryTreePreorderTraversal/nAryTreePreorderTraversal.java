package _589_nAryTreePreorderTraversal;

// https://leetcode.com/problems/n-ary-tree-preorder-traversal/

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class nAryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output_arr = new LinkedList<>();


        if (root == null) {
            return output_arr;
        }
        stack.add(root);
        while (! stack.isEmpty()) {
            Node node = stack.pollLast();
            output_arr.add(node.val);
            Collections.reverse(node.children);
            for (Node child : node.children) {
                stack.add(child);
            }
        }
        return output_arr;
    }
}


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class PostorderTraversalFromInorderAndPreorder {
    // Recursive function to find postorder traversal of a binary tree
    // from its inorder and preorder sequence
    public static void printPostorder(int start, int end,
                                      int[] preorder, AtomicInteger pIndex,
                                      Map<Integer, Integer> map) {
        // base case
        if (start > end) {
            return;
        }

        // The next element in the preorder sequence will be the root node of
        // subtree formed by sequence inorder[start, end]
        int value = preorder[pIndex.getAndIncrement()];

        // if the current node is a leaf node (no children)
        if (start == end) {
            // print the value of the root node and return
            System.out.print(value + " ");
            return;
        }

        // Get the root node index in inorder sequence to determine
        // its left and right subtree boundary
        int i = map.get(value);

        // recur for the left subtree
        printPostorder(start, i - 1, preorder, pIndex, map);

        // recur for the right subtree
        printPostorder(i + 1, end, preorder, pIndex, map);

        // print the value of the root node
        System.out.print(value + " ");
    }

    // Find postorder traversal on a given binary tree from its inorder and
    // preorder sequence. This function assumes that the input is valid.
    // i.e., given inorder and preorder sequence forms a binary tree.
    public static void findPostorder(int[] inorder, int[] preorder) {
        // create a map to efficiently find the index of any element in a
        // given inorder sequence
        Map<Integer, Integer> map = new HashMap<>();

        // fill the map
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        // `pIndex` stores the index of the next unprocessed node in the preorder.
        // start with the root node (present at 0th index)
        AtomicInteger pIndex = new AtomicInteger(0);

        System.out.print("Postorder traversal is ");
        printPostorder(0, inorder.length - 1, preorder, pIndex, map);
    }

    public static void main(String[] args) {
        /* Construct the following tree
                   1
                 /   \
                /     \
               2       3
              /       / \
             /       /   \
            4       5     6
                   / \
                  /   \
                 7     8
        */

        int[] inorder = {9, 2, 4, 6, 8, 7, 3, 1, 5, 10};
        int[] preorder = {8, 2, 9, 6, 4, 1, 3, 7, 5, 10};

        findPostorder(inorder, preorder);
    }
}

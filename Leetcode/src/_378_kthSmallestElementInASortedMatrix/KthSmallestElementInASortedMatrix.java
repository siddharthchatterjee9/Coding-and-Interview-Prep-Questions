package _378_kthSmallestElementInASortedMatrix;

// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
// TC is O(n * log k)
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maxheap.add(matrix[i][j]);
                if (maxheap.size() > k) {
                    maxheap.poll();
                }
            }
        }
        return maxheap.poll();
    }
}

package _823_binaryTreesWithFactors;

// https://leetcode.com/problems/binary-trees-with-factors/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BinaryTreesWithFactors {
    public int numFactoredBinaryTrees(int[] arr) {
        // inference drawn = tree will have at max 3 nodes
        if (arr == null || arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr); // to reduce the no. of times the loop is executed
        HashMap<Integer, Long> map = new HashMap<Integer, Long>();
        for (int i = 0; i < arr.length; i++) {
            long count = 1L;
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0 && map.containsKey(arr[i]/arr[j])) {
                    count += map.get(arr[j]) * map.get(arr[i]/arr[j]);
                }
            }
            map.put(arr[i], count);
        }
        long totalCount = 0;
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            totalCount += entry.getValue();
            System.out.println(" k " + entry.getKey() + " V" + entry.getValue());
        }
        return (int)(totalCount % (1000000000 + 7));
    }
}

package _1338_reduceArraySizeToHalf;

// https://leetcode.com/problems/reduce-array-size-to-the-half/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ReduceArraySizeToHalf {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        // Element, Frequency => Key, Value pair
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        List<Integer> freqs = new ArrayList<>(hm.values());
        Collections.sort(freqs, Collections.reverseOrder());

        int count = 0;
        int totalElements = n;
        int i = 0;
        while (totalElements > n/2) {
            totalElements = totalElements - freqs.get(i);
            i++;
            count++;
        }
        return count;
    }
}

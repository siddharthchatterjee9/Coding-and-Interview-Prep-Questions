package _169_majorityElement;

// https://leetcode.com/problems/majority-element/

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            // +1 to account for us seeing it right now!
            if (map.containsKey(num) && map.get(num) + 1 > n/ 2) {
                return num;
            }
            else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return -1;
    }
}

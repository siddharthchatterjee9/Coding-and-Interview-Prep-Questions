package _1480_runningSumOfA1DArray;

import java.util.ArrayList;
import java.util.List;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            list.add(sum);
        }
        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}

package _729_myCalendarI;
// start < floor and end > ceil :)
// https://leetcode.com/problems/my-calendar-i/

// TC is O(n log n)
import java.util.TreeMap;

public class MyCalendarI {
    TreeMap<Integer, Integer> calendar = null;
    public MyCalendarI() {
        calendar = new TreeMap<>();
    }
    public boolean book(int start, int end) {
        Integer floor = calendar.floorKey(start);
        Integer ceil = calendar.ceilingKey(start);
        if (floor != null && start < calendar.get(floor) || ceil != null && end > ceil) {
            return false;
        }
        calendar.put(start, end);
        return true;
    }
}

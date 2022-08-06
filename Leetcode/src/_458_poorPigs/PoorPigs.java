package _458_poorPigs;

// https://leetcode.com/problems/poor-pigs/
// tough hai

public class PoorPigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if (buckets-- == 1) {
            return 0;
        }
        int base = minutesToTest / minutesToDie + 1;
        int res = 0;
        while (buckets > 0) {
            buckets = buckets / base;
            res += 1;
        }
        return res;
    }
}

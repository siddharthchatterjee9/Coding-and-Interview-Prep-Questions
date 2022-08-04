package _858_mirrorReflection;

// https://leetcode.com/problems/mirror-reflection/

public class MirrorReflection {
    public int mirrorReflection(int p, int q) {
        while (p % 2 == 0 && q % 2 == 0) {
            p = p / 2;
            q = q / 2;
        }
        if (p % 2 != 0 && q % 2 == 0) {
            return 0;
        }
        else if (p % 2 == 0 && q % 2 != 0) {
            return 2;
        }
        else if (p % 2 != 0 && q % 2 != 0) {
            return 1;
        }
        return -1;
    }
    public static void main (String[] args) {
        MirrorReflection obj = new MirrorReflection();
        System.out.println(obj.mirrorReflection(3, 1));
    }
}

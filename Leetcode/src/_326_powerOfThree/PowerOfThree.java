package _326_powerOfThree;

// https://leetcode.com/problems/power-of-three/

import java.util.Scanner;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        double power = Math.log(n) / Math.log(3);
        if (power - (int) power == 0) {
            return true;
        }
        return false;
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        PowerOfThree obj = new PowerOfThree();
        System.out.println(obj.isPowerOfThree(n1));
    }
}

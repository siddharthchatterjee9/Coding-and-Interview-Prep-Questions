package subarray;

import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int count = 0;
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int k = 0; k < n; k++) {
                sum = array[k] + sum;
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

package kyu8;


import java.util.Scanner;

class Solution {
    public static int[] digitize(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}

public class Kata1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        Solution.digitize(in.nextLong());
    }
}

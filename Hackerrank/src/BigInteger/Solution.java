package BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

/* Author is 19BCE2249 Siddharth Chatterjee */
public class Solution {
    public static void main (String... args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger(in.nextLine());
        BigInteger b = new BigInteger(in.nextLine());
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger mul = BigInteger.valueOf(0);
        sum = a.add(b);
        mul = a.multiply(b);
        System.out.println(sum);
        System.out.println(mul);
    }
}

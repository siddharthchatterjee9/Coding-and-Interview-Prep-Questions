package primalitytest;

import java.math.BigInteger;
import java.util.Scanner;
// When certainty is one,
// it will check number for prime or composite

// When certainty is zero,
// it is always true

// When certainty is negative,
// it is always true
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        if (n.isProbablePrime(1)) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }

    }
}
package interfacesolution;

import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum (int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        if (n <= 1) {
            return n;
        }
        int res = n + 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                res = res + i;
            }
        }
        return res;
    }
}
public class Main {
    public static void main (String[] args) {
        MyCalculator obj = new MyCalculator();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Returning the sum of all its divisors... -> " + obj.divisor_sum(n));
    }
}

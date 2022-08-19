package _322_coinChange;

// https://leetcode.com/problems/coin-change/

import java.util.Arrays;
import java.util.Scanner;

class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i-coin] + 1);
            }
        }
        for (int x : dp) {
            System.out.print(x + " ");
        }
        System.out.println();
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int[] coins1 = {1,2,5};
        int amount1 = 11;
        CoinChange obj = new CoinChange();
        System.out.println(obj.coinChange(coins1, amount1));
    }
}
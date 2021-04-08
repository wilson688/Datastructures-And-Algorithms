package com.wilson688.algorithms.dp;

//        You are given coins of different denominations and a total amount of money.
//        Write a function to compute the number of combinations that make up that amount.
//        You may assume that you have infinite number of each kind of coin.
//               dp[i][j] = dp[i][j-1] + dp[ i - coins[j] ][j]

import java.util.Arrays;

public class CoinChange2 {

    public int change(int[] coins, int amount) {
        if (amount == 0) return 1;
        int n = coins.length;
        if (n == 0) return 0;

        int[][] dp = new int[amount + 1][n];
        Arrays.fill(dp[0], 1);

        // setting-up the first column, as result of each column depends on previous column
        for (int i = 1; i <= amount; i++) {
            dp[i][0] = (i < coins[0]) ? 0 : dp[i - coins[0]][0];
        }


        for (int i = 1; i <= amount; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i][j-1] + ( (i < coins[j]) ? 0 : dp[i - coins[j]][j] );
            }
        }

        return dp[amount][n-1];

    }


    public static void main(String[] args) {
        CoinChange2 cc = new CoinChange2();
        System.out.println(cc.change(new int[] {1,2,5}, 5) == 4);
        System.out.println(cc.change(new int[] {2}, 3) == 0);
        System.out.println(cc.change(new int[] {10}, 10) == 1);
        System.out.println(cc.change(new int[] {1}, 1) == 1);
        System.out.println(cc.change(new int[] {5}, 2) == 0);
    }
}

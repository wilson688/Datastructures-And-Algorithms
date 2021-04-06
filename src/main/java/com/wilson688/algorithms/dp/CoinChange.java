package com.wilson688.algorithms.dp;

import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        return this.solveCoinchange(coins, amount);
    }

    //bottom-up approach
    private int solveCoinchange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;

        for(int  i = 1;i<= amount;i++) {
            for (int coin:coins) {
                if (i>=coin && dp[i-coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[i-coin]); // 0 1 2 3

                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }


    int minCount = Integer.MAX_VALUE;
    //top-down approach
    public int solveRecursive(int[] coins, int amount) {
        Arrays.sort(coins);
        count(amount, coins.length - 1, coins, 0);
        return minCount == Integer.MAX_VALUE ? -1 : minCount;
    }

    void count(int amount, int index, int[] coins, int count) {

    }

    public static void main(String[] args) {
        CoinChange cc = new CoinChange();
        System.out.println(cc.coinChange(new int[] {1,2,5}, 11));
        System.out.println(cc.coinChange(new int[] {2}, 3));
        System.out.println(cc.coinChange(new int[] {1}, 0));
        System.out.println(cc.coinChange(new int[] {1}, 1));
        System.out.println(cc.coinChange(new int[] {1}, 2));
        System.out.println();
        System.out.println("======================================");
        System.out.println(cc.solveRecursive(new int[] {1,2,5}, 11));
        System.out.println(cc.solveRecursive(new int[] {2}, 3));
        System.out.println(cc.solveRecursive(new int[] {1}, 0));
        System.out.println(cc.solveRecursive(new int[] {1}, 1));
        System.out.println(cc.solveRecursive(new int[] {1}, 2));
    }
}

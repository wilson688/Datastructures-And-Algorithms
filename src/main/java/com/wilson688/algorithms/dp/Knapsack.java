package com.wilson688.algorithms.dp;

//The time complexity of the above algorithm is 2 power n, where n is the number of items



public class Knapsack {


    public int solveKnapsackBruteforce(int[] profits, int[] weights, int capacity) {
        return this.solveRecursive(profits, weights, capacity, 0);
    }


    private int solveRecursive(int[] profits, int[] weights, int capacity, int currentIndex) {
        //base check
        if ( capacity <= 0 || currentIndex >= profits.length) return 0;

        int profit = 0;
        if (weights[currentIndex] <= capacity) {
            profit = profits[currentIndex] + solveRecursive(profits, weights, capacity - weights[currentIndex], currentIndex+1);
        }

        int profit2 = solveRecursive(profits, weights, capacity, currentIndex+1);

        return Math.max(profit2, profit);
    }


    public int solveTopdownMemo(int[] profits, int[] weights, int capacity) {
        Integer[][] dp = new Integer[profits.length][capacity + 1];
        return this.solveTopDown(dp, profits, weights, capacity, 0);
    }

    private int solveTopDown(Integer[][] dp, int[] profits, int[] weights, int capacity, int currentIndex) {
        if (capacity <= 0 || currentIndex >= profits.length) return 0;

        if (dp[currentIndex][capacity] != null) return dp[currentIndex][capacity];

        int profit1 = 0;
        if (weights[currentIndex] <= capacity) {
            profit1 = profits[currentIndex] + solveTopDown(dp, profits, weights, capacity - weights[currentIndex], currentIndex + 1);
        }

        int profit2 = solveTopDown(dp, profits, weights, capacity, currentIndex + 1);

        dp[currentIndex][capacity] = Math.max(profit1, profit2);

        return dp[currentIndex][capacity];
    }



    public static void main(String[] args) {
        Knapsack ks = new Knapsack();
        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        System.out.println("Bruteforce -------------------------");
        Long startTime = System.currentTimeMillis();
        int maxProfit = ks.solveKnapsackBruteforce(profits, weights, 7);
        System.out.println("Total knapsack profit ---> " + maxProfit);
        System.out.println("Time Taken " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        maxProfit = ks.solveKnapsackBruteforce(profits, weights, 6);
        System.out.println("Total knapsack profit ---> " + maxProfit);
        System.out.println("Time Taken " + (System.currentTimeMillis() - startTime));
        System.out.println();
        System.out.println("Topdown Memoization -------------------------");
        startTime = System.currentTimeMillis();
        System.out.println("Total knapsack profit ---> " + ks.solveTopdownMemo(profits, weights, 7));
        System.out.println("Time Taken " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        System.out.println("Total knapsack profit ---> " + ks.solveTopdownMemo(profits, weights, 6));
        System.out.println("Time Taken " + (System.currentTimeMillis() - startTime));
    }
}

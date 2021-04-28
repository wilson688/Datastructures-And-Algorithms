package com.wilson688.algorithms.projecteuler;


import java.util.LinkedList;
import java.util.Queue;

/*
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.


How many such routes are there through a 20×20 grid?
 */
public class Problem15 {

    public long findAllRoutes(int N) {
        long[][] grid = new long[N+1][N+1];

        grid[1][1] = 1;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                long current = grid[i][j];
                if (j + 1 <= N) grid[i][j+1] += current;
                if (i + 1 <= N) grid[i+1][j] += current;
            }
        }

        return grid[N][N];
    }

    public static void main(String[] args) {
        Problem15 prob = new Problem15();

        System.out.println(prob.findAllRoutes(3));
        System.out.println(prob.findAllRoutes(21));
    }

}

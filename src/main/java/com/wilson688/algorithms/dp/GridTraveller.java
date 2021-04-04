package com.wilson688.algorithms.dp;

import java.util.Arrays;

public class GridTraveller {

    public static int gridTraveller(int m, int n) {

        int[][] grid = new int[m+1][n+1];

        grid[1][1] = 1;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                int current = grid[i][j];
                if (j + 1 <= n) grid[i][j+1] += current;
                if (i + 1 <= m) grid[i+1][j] += current;
            }
        }

        return grid[m][n];
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(gridTraveller(1, 1));
        System.out.println(gridTraveller(2, 3));
        System.out.println(gridTraveller(3, 2));
        System.out.println(gridTraveller(3, 3));
        System.out.println(gridTraveller(7, 3));

    }
}

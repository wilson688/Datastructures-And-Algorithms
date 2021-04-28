package com.wilson688.algorithms.other.storageoptimization__________;

/*
  A new region is under construction. The region is a rectangular area evenly divided into rows and cols blocks.
  Each block having a square of 1 unit. Several main roads are built horizontally or vertically throughout the region
  Every road on the lane takes the entire row or col of the square units.
  find out the biggest intersection.

  Example:
  Input:
  Row = 4
  Col = 3
  WELane = [2,3]
  NSLane = [2]
  Output = 2

  Example2:
  Row = 5
  Col = 10
  WELane = [1,3,4]
  NSLane = [4,5,6,8,9]
  Output = 6

 */

import java.util.*;

public class StorageOptimization {

    static char L = 'L';
    static char I = 'I';
    static char B = 'B';

    public int intersectionArea(int row, int col, ArrayList<Integer> WELane, ArrayList<Integer> NSLane) {
        int highestIntersection = 0;
        char[][] grid = new char[row + 1][col + 1];

        Arrays.stream(grid).forEach(a -> Arrays.fill(a, B));

        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i <= row; i++) {
            if (WELane.contains(i)) Arrays.fill(grid[i], L);
            for (int j = 0; j <= col; j++) {
               if (NSLane.contains(j) && grid[i][j] == B) {
                   grid[i][j] = L;
               } else if (NSLane.contains(j) && grid[i][j] == L) {
                   grid[i][j] = I;
                   stack.add(new int[] {i, j});
               }
            }
        }

        return stackTraversal(grid, highestIntersection, stack, row, col);

    }

    public int intersectionArea2(int row, int col, int[] WELane, int[] NSLane) {
        int highestIntersection = 0;
        char[][] grid = new char[row + 1][col + 1];

        Arrays.stream(grid).forEach(a -> Arrays.fill(a, B));

        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i <= row; i++) {
            if (containsIn(WELane, i)) Arrays.fill(grid[i], L);
            for (int j = 0; j <= col; j++) {
                boolean contains = containsIn(NSLane, j);
                if (contains && grid[i][j] == B) {
                    grid[i][j] = L;
                } else if (contains && grid[i][j] == L) {
                    grid[i][j] = I;
                    stack.add(new int[] {i, j});
                }
            }
        }

        return stackTraversal(grid, highestIntersection, stack, row, col);

    }

    private boolean containsIn(int[] Lane, int num) {
       for (int i = 0; i < Lane.length; i++) {
           if (num == Lane[i]) return true;
       }

       return false;
    }

    private int stackTraversal(char[][] grid, int highestIntersection, Stack<int[]> stack, int row, int col) {
        int currentIntersection = 0;
        while (!stack.isEmpty()) {
            int[] curr = stack.pop();
            int i = curr[0];
            int j = curr[1];


            if (grid[i][j] == I) {
                currentIntersection += 1;
                grid[i][j] = B;
                highestIntersection = Math.max(currentIntersection, highestIntersection);
            }

            int adjacent = 0;
            if (i - 1 >= 0 && i - 1 < row + 1 && j >= 0 && j < col + 1 && grid[i -1][j] == I) {
                stack.push(new int[] {i - 1, j});
                adjacent++;
            }
            if (i >= 0 && i < row + 1 && j - 1 >= 0 && j - 1 < col + 1 && grid[i][j - 1] == I) {
                stack.push(new int[] {i, j - 1});
                adjacent++;
            }
            if (i + 1 >= 0 && i + 1 < row + 1 && j >= 0 && j < col + 1 && grid[i+1][j] == I) {
                stack.push(new int[] {i + 1, j});
                adjacent++;
            }
            if (i> 0 && i < row + 1 && j + 1 > 0 && j + 1 < col + 1 && grid[i][j+1] == I) {
                stack.push(new int[] {i, j + 1});
                adjacent++;
            }

            if (adjacent == 0) currentIntersection = 0;

        }


        return highestIntersection;
    }

    public static void main(String[] args) {
        StorageOptimization storageOptimization = new StorageOptimization();
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(2);
        aList.add(3);

        ArrayList<Integer> bList = new ArrayList<>();
        bList.add(2);

        ArrayList<Integer> cList = new ArrayList<>();
        cList.add(1);
        cList.add(3);
        cList.add(4);

        ArrayList<Integer> dList = new ArrayList<>();
        dList.add(4);
        dList.add(5);
        dList.add(6);
        dList.add(8);
        dList.add(9);

        System.out.println(storageOptimization.intersectionArea(4, 3, aList, bList) == 2);
        System.out.println(storageOptimization.intersectionArea2(4, 3, new int[]{2, 3}, new int[] {2}) == 2);
        System.out.println(storageOptimization.intersectionArea2(5, 10, new int[]{1,3,4}, new int[] {4,5,6,8,9}) == 6);
        System.out.println(storageOptimization.intersectionArea(5, 10, cList, dList) == 6);
    }

}

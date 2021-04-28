package com.wilson688.algorithms.projecteuler;

/*
In the 20×20 grid below, four numbers along a diagonal line have been marked in red.

The product of these numbers is 26 × 63 × 78 × 14 = 1788696.

What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Problem11 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int ROW = 20;
    static int COL = 20;

    public long findProduct(int[][] grid) {
        int product = 0;
        int largest = 0;

        //horizantly
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL - 3; j++) {
                product = grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3];
                if (product > largest) {
                    largest = product;
                }
            }
        }

        //vertically
        for (int i = 0; i < ROW - 3; i++) {
            for (int j = 0; j < COL; j++) {
                product = grid[i][j]*grid[i+1][j]*grid[i+2][j]*grid[i+3][j];
                if (product > largest) largest = product;
            }
        }

        //diagonally right
        for (int i = 0; i < ROW - 3; i++) {
            for (int j = 0; j < COL - 3; j++) {
                product = grid[i][j]* grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
                if (product > largest) largest = product;
            }
        }

        //diagonally left
        for (int i = 0; i < ROW - 3; i++) {
            for (int j = 3; j < COL - 3; j++) {
                product = grid[i][j]* grid[i+1][j-1] * grid[i+2][j-2] * grid[i+3][j-3];
                if (product > largest) largest = product;
            }
        }


        return largest;
    }


    private void printGrid(int[][] grid) {

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {

        Problem11 prob = new Problem11();
        int[][] grid = new int[ROW][COL];

        for (int i = 0; i < ROW; i++) {
            String[] currentLine = br.readLine().trim().split("\\s+");;
            for (int j = 0; j < COL; j++) {
                grid[i][j] = Integer.parseInt(String.valueOf(currentLine[j]));
            }
        }


      //print grid
     // prob.printGrid(grid);

        System.out.println(prob.findProduct(grid));
    }

}

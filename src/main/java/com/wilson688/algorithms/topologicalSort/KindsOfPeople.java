package com.wilson688.algorithms.topologicalSort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class KindsOfPeople {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final static String NEITHER = "neither";
    final static String BINARY = "binary";
    final static String DECIMAL = "decimal";

    public static String moveSpaces(int[][] grid, int startRow, int startCol, int endRow, int endCol) {

        int gridRowLength = grid.length;
        int gridColLength = grid[0].length;
        boolean[][] visited = new boolean[gridRowLength][gridColLength];
        int[] dx = { 0, 0, -1, 1 }, dy = { 1, -1, 0, 0 };

        if (startCol == endCol && startRow == endRow) {
            int current = grid[startRow -1][startCol -1];

            return current == 0? BINARY: DECIMAL;
        }

        if(startRow - 1 <= gridRowLength && startCol - 1 <= gridColLength && endCol - 1 <= gridColLength && endRow - 1 <= gridRowLength) {
            //get current moving element
            String currentKind = grid[startRow - 1][startCol - 1] == 0 ? BINARY : DECIMAL;
            int otherKind = currentKind == BINARY? 1 : 0;
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[] {startRow - 1, startCol - 1});

            while(!queue.isEmpty()) {
                int[] pair = queue.poll();
                int r =  pair[0];
                int c =  pair[1];

                if(grid[r][c] != otherKind && visited[r][c] == false) {
                    //now grab other ways
                    visited[r][c] = true;

                    for (int x = 0; x < 4; x++) {
                        int r2 = r + dx[x];
                        int c2 = c + dy[x];

                        if( r2 < 0 || c2 < 0 || r2 >= gridRowLength || c2 >= gridColLength || visited[r2][c2] || grid[r2][c2] != grid[r][c]) continue;

                        queue.add(new int[]{r2, c2});

                    }

                }

                if(r == endRow - 1 && c == endCol -1) {
                    return currentKind;
                }

            }
        }

        return NEITHER;
    }

    public static void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            System.out.println();
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(" "+grid[i][j]);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        String[] inputs = br.readLine().split(" ");
        int rows = Integer.parseInt(inputs[0]);
        int cols = Integer.parseInt(inputs[1]);

        int[][] grid = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            char[] currentLine = br.readLine().toCharArray();
            for (int j = 0; j < cols; j++) {
                grid[i][j] = Integer.parseInt(String.valueOf(currentLine[j]));
            }
        }

        int testCases = Integer.parseInt(br.readLine());

        System.out.println();
        for (int i = 0; i < testCases; i++) {
            String[] queryInputs = br.readLine().split(" ");
            System.out.println(moveSpaces(grid, Integer.parseInt(queryInputs[0]), Integer.parseInt(queryInputs[1]), Integer.parseInt(queryInputs[2]), Integer.parseInt(queryInputs[3])));
        }
    }
}

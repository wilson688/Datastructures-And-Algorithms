package com.wilson688.algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

    public List<Integer> solve(int rowIndex) {

        if (rowIndex < 0) return null;


        List<Integer> result = new ArrayList<>();
        result.add(0, 1);
        if (rowIndex == 0) return result;

        result.add(1, 1);

        int index = 2;
        while (index <= rowIndex) {
            List<Integer> newResult = new ArrayList<>();
            newResult.add(0, 1);
            for (int i = 1; i < index; i++) {
                int sum = result.get(i-1) + result.get(i);
                newResult.add(i, sum);
            }
            newResult.add(index, 1);
            index++;

            result.clear();
            result.addAll(newResult);
        }


        return result;
    }


    public static void main(String[] args) {
        PascalTriangle2 ps = new PascalTriangle2();

        System.out.println(ps.solve(0));
        System.out.println(ps.solve(1));
        System.out.println(ps.solve(2));
        System.out.println(ps.solve(3));
        System.out.println(ps.solve(4));
        System.out.println(ps.solve(5));
    }
}

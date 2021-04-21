package com.wilson688.algorithms.projecteuler;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

 */


public class Problem1 {

    //let's try for 100

    public int solve(int n) {
        int sum = 0;
        if (n <= 1) return n;

        for (int i = 1; i < n; i++) {
            if ( i % 3 == 0 || i % 5 == 0) sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Problem1 prb = new Problem1();
        long start = System.currentTimeMillis();
        System.out.println(prb.solve(1000));
        System.out.println(System.currentTimeMillis() - start);
    }
}

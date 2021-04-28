package com.wilson688.algorithms.projecteuler;

/*
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

(13) --- 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
(26) --- 26 -> 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
(3) ---  3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
(9) --- 9 -> 28 -> 14 -> 7 -> 22 -> 11 -> 34 -> 17 -> 42 -> 21 -> 64 -> 32 -> 18 -> 9
(4) --- 4 -> 2 -> 1
(6) --- 6 -> 3 ->

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.

 */

public class Problem14 {

    static final int MAX = 1000000;

    private long findNumbersUnder() {
        int size = 1;
        int max = 1;
        int[] t_cache = new int[1000000];
        int[] visited = new int[1000000];

        for (int j = 2; j < MAX; j++) {
            long i = j;
            int t = 0;
            do {
                ++t;
                if ((i & 1) == 0) {
                    i >>= 1;
                    if (i < j) {
                        t += t_cache[(int)i];
                        break;
                  }
                }else {
                    i = i*3 + 1;
                }
            } while(true);
            t_cache[j] = t;

            if (t > size) {
                size = t;
                max = j;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Problem14 prob = new Problem14();

        System.out.println(prob.findNumbersUnder());
    }
}

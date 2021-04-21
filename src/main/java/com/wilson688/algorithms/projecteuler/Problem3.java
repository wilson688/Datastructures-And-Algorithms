package com.wilson688.algorithms.projecteuler;

//
//The prime factors of 13195 are 5, 7, 13 and 29.
//
//        What is the largest prime factor of the number 600851475143 ?


import java.util.ArrayList;
import java.util.List;

public class Problem3 {

    final static long MAX_VALUE = 600851475143l;
    static List<Long> primes = new ArrayList<Long>();
    public long solve(long num) {

       int i = 0;
       for (i = 2; i < MAX_VALUE; i++) {
           if (num % i == 0) {
               num = num / i;
           }
           if (num == 1) return i;
       }

        return i;
    }

    public static void main(String[] args) {
        Problem3 prb = new Problem3();
        System.out.println(prb.solve(600851475143l));
        System.out.println(prb.solve(13195l) == 29);
    }
}

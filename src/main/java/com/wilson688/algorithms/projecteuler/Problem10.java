package com.wilson688.algorithms.projecteuler;


/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */

public class Problem10 {

    public long findSum(long n) {
        long result = 0;

        for (int i = 2; i < n; i++) {

            if (isPrime(i)) result += i;
        }

        return result;
    }


    private boolean isPrime(long n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
             if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Problem10 prob = new Problem10();

        System.out.println(prob.findSum(10l));
        System.out.println(prob.findSum(2000000l));
    }
}

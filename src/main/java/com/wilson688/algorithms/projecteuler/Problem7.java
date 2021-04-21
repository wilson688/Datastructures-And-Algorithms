package com.wilson688.algorithms.projecteuler;
//
//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//        What is the 10001st prime number?


import java.util.ArrayList;
import java.util.List;

public class Problem7 {

    static ArrayList<Integer> primes = new ArrayList<>();

    final static int MAX = 10000000;

    public static List<Integer> generatePrimes(int N) {
        int j;
        boolean isPrime;

        primes.add(2);
        for (int i = 2; i < N; i++) {
            isPrime = true;
            for(int check = 2; check <= Math.sqrt(i); ++check) {
                if (i % check == 0) isPrime = false;
            }

            if (isPrime) primes.add(i);
        }

        return primes;
    }

    //uses generated primes list
    public static long findNthPrime(int n) {
        return primes.get(n);
    }


    public static long nthPrime(int n) {
       int numOfPrimes = 0;
       long prime = 1;

       while (numOfPrimes < n) {
           prime++;
           if (isPrime(prime)) {
               numOfPrimes++;
           }
       }

       return prime;
    }

    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        } else if (n <= 3) return true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        generatePrimes(MAX);
        System.out.println(findNthPrime(10001));
        System.out.println(System.currentTimeMillis() - start);


        long start2 = System.currentTimeMillis();
        System.out.println(nthPrime(10001));
        System.out.println(System.currentTimeMillis() - start2);
    }
}

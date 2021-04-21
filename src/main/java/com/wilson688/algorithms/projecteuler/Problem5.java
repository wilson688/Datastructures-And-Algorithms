package com.wilson688.algorithms.projecteuler;

//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//  What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

//This is an example of LCM (Least Common Multiple)
// LCM(a,b) = a*b/gcd(a,b)


import java.util.ArrayList;
import java.util.List;

public class Problem5 {

    static List<Integer> primes = new ArrayList<>();
    public static boolean isDivisble(int num, int N) {
        for (int i = 1; i <= N; i++) {
            if (num % i != 0) return false;
        }

        return true;
    }


    public static int solution(int N) {

        int minValue = Integer.MAX_VALUE;
        int total = 1;
        for (int i = 1; i <= N; i++) {
                total = total*i;

        }

        while (total > N) {
            boolean flag = isDivisble(total, N);
            if (flag == true) {
                minValue = Math.min(minValue, total);
            }
            total--;
        }

        return minValue;
    }


    public static List<Integer> generatePrimes(int N) {
        int j;
        boolean isPrime;

        primes.add(2);
        for (int i = 3; i < N; i++) {
           j = 0;
           isPrime = true;
           while (primes.get(j)*primes.get(j) <= i) {
                if (i % primes.get(j) == 0) isPrime = false;
                break;
           }
           j++;

           if (isPrime) primes.add(i);
        }

        return primes;
    }

    // LCM approach
    public static int findlcm(int a, int b) {
      if (b == 1) return a;

      a = a*b/findGCD(a, b);
      b -= 1;

      return findlcm(a, b);
    }


    private static int findGCD(int a, int b) {

        if (a == 0) return b;

        return findGCD(b % a, a);
    }

    private static int gcd(int N) {
        int result = 0;

        for (int i = 2; i <= N; i++) {
            result = findGCD(result, i);

            if (result == 1) {
                return 1;
            }
        }

        return result;
    }


    public static long lcm(int n) {
        generatePrimes(100000);
        long lcm = 1;
        for (int i = 0;
             i < primes.size() && primes.get(i) <= n;
             i++)
        {
            // Find the highest power of prime, primes[i]
            // that is less than or equal to n
            int pp = primes.get(i);
            while (pp * primes.get(i) <= n)
                pp = pp * primes.get(i);

            // multiply lcm with highest power of prime[i]
            lcm *= pp;
            lcm %= 1000000007;
        }
        return lcm;
    }


    public static void main(String[] args) {
        System.out.println(findlcm(10, 9));
        System.out.println(lcm(20) == 232792560);
        System.out.println(solution(20));
    }

}

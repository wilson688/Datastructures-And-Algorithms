package com.wilson688.algorithms.math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gcd {

   List<Integer> primes = new ArrayList<>();

   public int solution(int[] arr) {
      primes = generatePrimes(50);

      int result = 1;
      HashMap<Integer, Integer> map = new HashMap<>();

      for (int j = 0; j < arr.length; j++) {
          for (int i = 0; i < primes.size(); i++) {
              int currPrime = primes.get(i);
              if (currPrime <= arr[j]) {
                  if (arr[j] % currPrime == 0) {
                      if (!map.containsKey(currPrime)) {
                          map.put(currPrime, 1);
                      } else {
                          map.put(currPrime, map.get(currPrime) + 1);
                      }
                  }
              } else break;
          }
      }

      int arrCount = arr.length;

       for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
           if (mp.getValue() == arrCount) {
               result = result* mp.getKey();
           }
       }

       return result;
   }


   private int findGCD(int a, int b) {

       if (a == 0) return b;

       return findGCD(b % a, a);
   }

   public int solution2(int[] arr) {
       int result = 0;
       int length = arr.length;

       for (int element: arr) {
           result = findGCD(result, element);

           if (result == 1) {
               return 1;
           }
       }

       return result;
   }


   private List<Integer> generatePrimes(int N) {
       primes.add(2);
       int j = 0;
       boolean isPrime;

       for (int i = 3; i <= N; i++) {
           isPrime = true;

           while (primes.get(j) * primes.get(j) <= i) {
               if (i % primes.get(i) == 0) isPrime = false;
               break;
           }
           j++;

           if (isPrime) primes.add(i);

       }

       return primes;
   }

    public static void main(String[] args) {
        gcd gd = new gcd();

        System.out.println(gd.solution(new int[] {2, 4, 6, 8, 10}) == 2);
        System.out.println(gd.solution(new int[] {15, 18, 24, 30, 36}) == 3);
        System.out.println(gd.solution2(new int[] {15, 18, 24, 30, 36}));
        System.out.println(gd.solution2(new int[] {2, 4, 6, 8, 10}));
        System.out.println(gd.solution2(new int[] {10, 20, 30, 5}) == 5);

    }
}

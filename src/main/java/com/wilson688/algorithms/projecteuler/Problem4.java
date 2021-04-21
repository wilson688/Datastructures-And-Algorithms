package com.wilson688.algorithms.projecteuler;

//
//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//        Find the largest palindrome made from the product of two 3-digit numbers.

//
//1. find the products of two 3 digit numbers
//2. check if it a palindrome
//3. if yes then return that number

import java.util.PriorityQueue;

public class Problem4 {

    public int solve(int n) {
        boolean result = false;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
           sb.append('9');
        }

        int num = Integer.parseInt(sb.toString());
        int num1 = 0;
        int num2 = 0;
        int product = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (num1 = num; num1 > 1; num1--) {
            for (num2 = num; num2 > 1; num2--) {
                int internalProduct = num1*num2;
                result = checkPalindrome(internalProduct);
                if (result == true) pq.add(internalProduct);
            }
        }

        int res = pq.peek();
        return res;
    }

    public boolean checkPalindrome(int number) {
        String num = String.valueOf(number);

        int i = 0;
        int j = num.length() - 1;

        while (i < j) {
            char ch1 = num.charAt(i);
            char ch2 = num.charAt(j);
            if (ch1 != ch2) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Problem4 prb = new Problem4();
        System.out.println(prb.solve(3) == 906609);
        System.out.println(prb.solve(2) == 9009);
    }

}

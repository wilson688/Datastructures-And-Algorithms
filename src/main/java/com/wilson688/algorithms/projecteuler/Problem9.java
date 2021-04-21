package com.wilson688.algorithms.projecteuler;


/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.


 */

public class Problem9 {

    public int findProduct(int n) {
        int result = 0;

        for (int a = 3; a < n; a++) {
            for (int b = a +1; b < n; b++) {
                double cSquared = Math.pow(a, 2) + Math.pow(b, 2);
                double c = Math.pow(cSquared, 0.5);


                if ( a + b + c == n) {
                    return (int) (a*b*c);
                }
            }
        }


        return result;
    }

    public static void main(String[] args) {
        Problem9 prob = new Problem9();

        System.out.println(prob.findProduct(1000));
    }
}

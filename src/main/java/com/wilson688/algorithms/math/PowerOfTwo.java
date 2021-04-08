package com.wilson688.algorithms.math;

public class PowerOfTwo {


    public boolean solve(int n) {

        if ( n == 0 || n == 1) return true;

        while ( n > 0 && n % 2 == 0) {
            n /= 2;
        }


        return n == 1 ? true : false;
    }


    public static void main(String[] args) {
        PowerOfTwo pt = new PowerOfTwo();

        System.out.println(pt.solve(1));
        System.out.println(pt.solve(16));
        System.out.println(pt.solve(3));
        System.out.println(pt.solve(4));
        System.out.println(pt.solve(5));
        System.out.println(pt.solve(6));
    }
}

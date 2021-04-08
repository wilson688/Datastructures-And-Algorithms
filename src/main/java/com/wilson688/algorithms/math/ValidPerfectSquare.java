package com.wilson688.algorithms.math;

public class ValidPerfectSquare {

    public boolean solve(int n) {
        if (n == 0 || n == 1) return true;



        int m = n / 2;

        int index = 2;

        while (index <= m && index * index <= n) {
            if (index * index == n) return true;
            index++;
        }

        return false;
    }


    public static void main(String[] args) {
        ValidPerfectSquare vps = new ValidPerfectSquare();

        System.out.println(vps.solve(16) == true);
        System.out.println(vps.solve(4) == true);
        System.out.println(vps.solve(6) == false);
        System.out.println(vps.solve(8) == false);
        System.out.println(vps.solve(24) == false);
        System.out.println(vps.solve(14) == false);
        System.out.println(vps.solve(16) == true);
        System.out.println(vps.solve(25) == true);
        System.out.println(vps.solve(100) == true);
        System.out.println(vps.solve(1) == true);
        System.out.println(vps.solve(0) == true);
    }
}

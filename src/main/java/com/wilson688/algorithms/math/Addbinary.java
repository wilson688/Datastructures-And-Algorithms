package com.wilson688.algorithms.math;

public class Addbinary {


    public String solve(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int i = a.length() -1;
        int j = b.length() - 1;
        int carry = 0;

        while ( i >= 0 && j >= 0) {
            int currA = a.charAt(i) - '0';
            int currB = b.charAt(j) - '0';

            int sum = carry;

            sum += currA;
            sum += currB;

            sb.append(sum%2);
            carry = sum/2;

            i--;
            j--;
        }

        while (i >= 0) {
            int sum = carry;
            sum += a.charAt(i) - '0';
            sb.append(sum%2);
            carry = sum/2;
            i--;
        }

        while (j >= 0) {
            int sum = carry;
            sum += b.charAt(j) - '0';
            sb.append(sum%2);
            carry = sum/2;
            j--;
        }

        if (carry != 0) {
            sb.append(carry);
        }


        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        Addbinary ab = new Addbinary();

        System.out.println(ab.solve("11","1").equals("100"));
        System.out.println(ab.solve("1010","1011").equals("10101"));
        System.out.println(ab.solve("10","101").equals("111"));
        System.out.println(ab.solve("101","101").equals("1010"));
        System.out.println(ab.solve("1","111").equals("1000"));
    }
}

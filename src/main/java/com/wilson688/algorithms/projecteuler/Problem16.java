package com.wilson688.algorithms.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Problem16 {
    final static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String[] inputs = bufferedReader.readLine().split(" ");

        BigInteger n = BigInteger.valueOf(Integer.parseInt(inputs[0]));
        BigInteger product = n.pow(Integer.parseInt(inputs[1]));
        int sum = 0;

        String productValue = product.toString();

        for (int i = 0; i < productValue.length(); i++) {
            sum += productValue.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}

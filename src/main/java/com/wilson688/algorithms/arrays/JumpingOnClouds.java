//package com.wilson688.algorithms.arrays;
//
//import java.io.IOException;
//import java.util.Scanner;
//
//public class JumpingOnClouds {
//
//    static int jumpingOnClouds(int[] clouds) {
//
//
//
//
//
//    }
//
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] c = new int[n];
//
//        String[] cItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int cItem = Integer.parseInt(cItems[i]);
//            c[i] = cItem;
//        }
//
//        int result = jumpingOnClouds(c);
//
//        scanner.close();
//    }
//}

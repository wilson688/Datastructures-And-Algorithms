package com.wilson688.algorithms.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */


}

 public class CountingValleys {

     public static int countingValleys(int steps, String path) {
         // Write your code here'

         //everytime we hit 0 it is one complete valley
         //D would be considered -1
         //U would be 1
         int valleyCounter = 0;
         if (steps < 2) return 0;
         int depth = 0;

         for (int i = 0; i < steps; i++) {
             char ch = path.charAt(i);

             if (ch == 'U') {
                 depth += 1;
             } else depth -= 1;

             if (depth == 0 && ch == 'U') valleyCounter++;
         }


         return valleyCounter;
     }


     public static void main(String[] args) throws IOException {
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

         int steps = Integer.parseInt(bufferedReader.readLine().trim());

         String path = bufferedReader.readLine();

         System.out.println(CountingValleys.countingValleys(steps, path));


         bufferedReader.close();

     }
}
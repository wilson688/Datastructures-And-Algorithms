package com.wilson688.algorithms.projecteuler;

//
//The sum of the squares of the first ten natural numbers is,
//
//        The square of the sum of the first ten natural numbers is,
//
//        Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
//
//        Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.


public class Problem6 {


    public long solution(int N) {
        long diff = 0;
        long squares = 0;
        long cubes = 0;


        //find sum of squares
        for (int i = 2; i <= N; i++) {
            squares += i*i;
        }

        //find sum of cubes
        for (int i = 2; i <= N; i++) {
            cubes += Math.pow(i, 3);
        }

        return cubes-squares;
    }


    //FORMULA BASED
   //    (n(n+1)/2)pow(2) -> the sum of the first n cubes is the square of the sum of the first n natural numbers.
    // sum of squares -> [n(n+1)(2n+1)]/6
    public long fomulaBased(int N) {
        long diff = 0;

        long sumOfN = N*(N+1)/2;
        long cubes = sumOfN*sumOfN;

        long sqaures = N*(N+1)*(2*N+1)/6;

        diff = cubes - sqaures;

        return diff;
    }

    public static void main(String[] args) {
        Problem6 prb = new Problem6();

        System.out.println(prb.solution(10) == prb.fomulaBased(10));
        System.out.println(prb.solution(100));

    }
}

package com.wilson688.algorithms.other.winningsequence;

/*
Given the lower and upper bound of a range of integers, find the largest "mountain array". A mountain array is defined as in the Peak of mountain array problem, i.e. An array that

has at least 3 elements
let's call the element with the largest value the "peak", with index k. The array elements monotonically increase from the first element to A[k], and then monotonically decreases from A[k + 1] to the last element of the array. Thus creating a "mountain" of numbers.
If more tham one valid mountain arrays can be built from a given range of integers, the largest array is the one with the maximum values starting from the left side. For example, [6, 7, 6, 5] is larger than [5, 6, 7, 5] because first value is larger in the first array.

Return the largest mountain array satisfying the constraints, or -1 if it's not possible.

Examples
Example 1:
Input: num = 4, lowerEnd = 3, upperEnd = 10
Output: [9 10 9 8]
Example 2:
Input: num = 5, lowerEnd = 1, upperEnd = 3
Output: [1 2 3 2 1]
 */
public class WinningSequence {
}

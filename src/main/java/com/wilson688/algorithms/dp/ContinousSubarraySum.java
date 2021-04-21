package com.wilson688.algorithms.dp;

import java.util.Arrays;

public class ContinousSubarraySum {

    //Arrays.sort -> O(nlogn)

    private static boolean checkSubarraySum(int[] nums, int sum) {
      //  Arrays.sort(nums);

        if (sum <= 0) return false;
        int currSum = 0;
        int i = 0;
        while (i < nums.length) {

            if (nums[i] == sum) return true;

            currSum += nums[i];

            if (currSum == sum) {
                return true;
            } else if (currSum > sum) {
                currSum = 0;
            } else {
                i++;
            }

        }

        if (currSum == sum) return true;

        return false;
    }


    public static void main(String[] args) {
        System.out.println(checkSubarraySum(new int[] {23,2,4,6,7}, 6) == true);
        System.out.println(checkSubarraySum(new int[] {23,2,6,4,7}, 6) == true);
        System.out.println(checkSubarraySum(new int[] {23,2,6,4,7}, 13) == false);
        System.out.println(checkSubarraySum(new int[] {23,2,6,4,7}, 2) == true);
        System.out.println(checkSubarraySum(new int[] {23,2,6,4,7}, 31) == true);
        System.out.println(checkSubarraySum(new int[] {23,2,6,4,7}, 0) == false);
    }
}

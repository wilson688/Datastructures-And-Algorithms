package com.wilson688.algorithms.other.scheduledelivery;

/*
You are the manager of logistics for a burger franchise, and you are tasked with delivering supplies as quickly as possible.

There are n restaurants with 4 receiving docks each. Each dock has a specified maximum receiving rate.

Input
n = number of restaurants

openTimes = a number that represents the time the ith restaurant opens

deliveryTimeCost = an array of numbers representing the time it takes to unload a delivery. There are exactly n * 4 values in this list.

Output
The earliest time all deliveries can be completed.

Examples
Example 1:
Input:
n = 2

openTimes = [8, 10]

deliveryTimeCost = [2,2,3,1,8,7,4,5]

Output: 16
Explanation:
For the restaurant that opens at 8, assign deliveries with cost [8, 7, 5, 4]. These will complete at (8+8), (8+7), (8+5), and (8+4), which are 16, 15, 13, and 12 respectively.

For the restaurant that opens at 10, assign deliveries with cost [3, 2, 2, 1]. These will complete at (10+3), (10+2), (10+2), and (10+1), which are 13, 12, 12, and 11 respectively.

The lastest of all of the delivery completion time is at 16.
 */
public class EarliestTimeToDelivery {
}

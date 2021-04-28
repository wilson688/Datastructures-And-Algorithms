package com.wilson688.algorithms.other.mintotalcontainers;

/*
Your company is relocating its office, and employees have been asked to pack their belongings into boxes.

As movers, you can move one truckload a day. The truck size needed for day i is the maximum box size moved on that day.

There are N boxes and k days, where the number of boxes is greater than or equal to the number of days. You must move at least one box per day.

The list P represents the boxes, where each entry is the size of the box. You can move the box with index i if and only if all boxes with smaller indexes have already been moved.

Find the minimum total truck size required to move all the boxes.

Examples
Example 1:
Input: P = [10, 2, 20, 5, 15, 10, 1], d = 3
Output: 31
Explanation:
day 1 - [10, 2, 20, 5, 15]. TruckSize = 20
day 2 - [10]. TruckSize = 10
day 3 - [1]. TruckSize = 1
Total = 20 + 10 + 1 = 31

Example 2:
Input: P = [10, 2, 20, 5, 15, 10, 1], d = 5
Output: 43
Explanation:
day 1 - move [10]. TruckSize = 10
day 2 - move [2]. TruckSize = 2
day 3 - move [20, 5, 15]. TruckSize = 20
day 4 - move [10]. TruckSize = 10
day 5 - move [1]. TruckSize = 1
Total = 10 + 2 + 20 + 10 + 1 = 43

Example 3:
Input: P = [5, 4, 2, 4, 3, 4, 5, 4], d = 4
Output: 16
Explanation:
day 1 - [5, 4], TruckSize = 5
day 2 - [2], TruckSize = 2
day 3 - [4, 3], TruckSize = 4
day 4 - [4, 5, 4], TruckSize = 5
Total = 5 + 2 + 4 + 5 = 16

Example 4:
Input: P = [22, 12, 1, 14, 17], d = 2
Output: 39
Explanation:
day 1 - [22, 12], TruckSize = 22
day 2 - [1, 14, 17], TruckSize = 17
Total = 22 + 17 = 39
 */
public class MinTotalContainerSize {
}

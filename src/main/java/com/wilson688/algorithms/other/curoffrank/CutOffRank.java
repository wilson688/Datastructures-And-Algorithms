package com.wilson688.algorithms.other.curoffrank;

/*
Each year, employees of an organization are rated based on their performance. The employees are then ranked based on the ratings. Enployees with the same ratings will have the same rankings, but the next employee with the next lowest score will be rated based on the position within the list of all rankings. Employees below the cutoff rank are placed in a layoff list.

Give the ratings each employee receives and the cutoff rank, return the number of employees who are not in the layoff list.

Example 1:
Input: cutoff rank = 2, scores = [100 90 80 70 60]
Output: 2
Explanation:
The employee rankings are [1, 2, 3, 4, 5]. And with a cutoff rank of two, only the first 2 employees are not in the layoff list.

Example 2:
Input: cutoff rank = 4, scores = [100 100 80 70 60]
Output: 4
Explanation:
The first two employees have equal rating and both receives a ranking of 1. Employee with score 80 has 2 employees in front of him so he receives a ranking of 3. The final employee rankings are [1, 1, 3, 4, 5]. With a cutoff rank of 4, the first 4 employees are out of the layoff list.


 */
public class CutOffRank {
}

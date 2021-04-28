A car manufacturing plant would like to schedule their production jobs within d days. The jobs must be completed in order. For example, let's say the assembly job comes before the painting job, the assembly must be completed on the same day or a previous day for the painting to start. At least one job must be completed every day.

Given the difficulty of each job, find the schedule that results in the lowest overall difficulty. The difficulty of a given day is the job with the highest difficulty of that day.

Input
jobDifficulty = the list of jobs, in order, where each entry represents the difficulty number of that job.

d = the total number of days. Each day must be scheduled with at least one job.

Output
Build a schedule with the lowest overall difficulty and return the total sum of difficulty. If a valid schedule can't be built, return -1.

Example 1:
Input: jobDifficulty = [6,5,4,3,2,1], d = 2
Output: 7
Explanation:
The first five jobs can be squeezed into day 1, and on day 2 the last job can be completed.

Day 1 = [6,5,4,3,2] - maximum difficulty is 6

Day 2 = [1] - maximum difficulty is 1

The overall difficulty of the schedule = 6 + 1 = 7

Example 2:
Input: jobDifficulty = [9,9,9], d = 4
Output: -1
Explanation:
The schedule can't be filled since there aren't enough jobs.

Example 3:
Input: jobDifficulty = [1,1,1], d = 3
Output: 3
Explanation:
Since every day must have at least one job, each job must be assigned to each day. Therefore the total difficulty is 3.

Example 4:
Input: jobDifficulty = [7,1,7,1,7,1], d = 3
Output: 15
Day 1 = [7,1,7] - maximum difficulty is 7

Day 2 = [1,7] - maximum difficulty is 7

Day 3 = [1] - maximum difficulty is 1

The overall difficulty of the schedule = 7 + 7 + 1 = 15

Example 5:
Input: jobDifficulty = [1,10,2,20,3,30,4,40], d = 6
Output: 76
Day 1 = [1] - maximum difficulty is 1

Day 2 = [10] - maximum difficulty is 10

Day 3 = [2] - maximum difficulty is 2

Day 4 = [20] - maximum difficulty is 20

Day 5 = [3] - maximum difficulty is 3

Day 6 = [30,4,40] - maximum difficulty is 40

The overall difficulty of the schedule is 1 + 10 + 2 + 20 + 3 + 40 = 76

Constraints
There is always at least one job, and d is greater than 0.
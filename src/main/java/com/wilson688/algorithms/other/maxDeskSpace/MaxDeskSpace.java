package com.wilson688.algorithms.other.maxDeskSpace;

/*
A user wants to store a file in a data center, but requests it to be replicated across each machine in a block. A block is defined as a continuous set of machines, starting from the first machine, with each block being next to one another and fixed in size. For example, if the block size is defined as 3, the first block is composed of machines 1 to 3, the second block is composed of machines 2 to 5, and so on.

Find the largest possible file the user can store in a data center, given a block size.

Input
freeSpace: a list of numbers representing the free space available in each machine of the data center

blockSize: a number representing the size of each block

Output
A number representing the amount of free space that the emptiest block in the data center has. The free space within a given block is the minimum free space of all the machines in it.

Constraints
The size of the block is always smaller than the number of machines in the freeSpace list. freeSpace values are never zero.

Examples
Example 1:
Input:
freeSpace = [8,2,4,5]

blockSize = 2

Output: 4
Explanation:
In this data center, the subarrays representing the free space of each block of size 2 are [8,2], [2,4], and [4,5]. The minimum available space of each blocks is 2, 2, and 4. The maximum of these values is 4. Therefore, the answer is 4.


 */

public class MaxDeskSpace {
}

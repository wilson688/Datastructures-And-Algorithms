# Minimum Cost to Connect All Nodes (Minimum Spanning Tree I)

Monster Airlines has a set of n destination cities and a list of flight paths connecting some of the cities together. Your job is to find the flight paths that would connect all of the cities together, but with minimum total travel distance.

Input
The input consists of three arguments:

n = the number of nodes (ie. cities). The cities are represented by numbers 1...n.

edges = an array of flight paths, represented by pairs of numbers corresponding to the cities being connected.

costs = a list of distances in number triplets. The first two numbers represent the cities being connected, and the last number is the distance. For example, [1,2,3] would state that the distance between cities 1 and 2 is 3. Due to certain constraints, not all cities can be connected, so if a triplet is not found in this list, it is not possible to connect them.

Examples
Example 1:
Input: n = 6, edges = [[1, 4], [4, 5], [2, 3]], costs = [[1, 2, 5], [1, 3, 10], [1, 6, 2], [5, 6, 5]]
Output: 7
Explanation:
The edges can be collected into interconnected groups of cities, ie. [1, 4, 5], [2, 3], and [6]. This helps identify what needs to be connected.

The cheapest path between the first and second group is [1, 2]. The cheapest path between the first and third group is [1, 6], and there is no available path between the second and third group.

The cost of each path is 5 and 2 respectively, therefore the total cost is 5 + 2 = 7.

hint: What’s the time complexity of your algorithm? Can you make the running time O(E * log(E)) by using union find?
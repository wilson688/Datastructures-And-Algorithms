Given a string s made up of lowercase alphabet characters, find all unique substrings containing distinct characters of length k.

Examples
Example 1:
Input: s = xabxcd, k = 4
Output: ["abxc", "bxcd"]
Explanation:
Substrings of size 4 in s are xabx, abxc, and bxcd. However x repeats in the xabx, so it is not a valid substring made up of distinct characters.

Example 2:
Input: s = aabcdbcd, k = 3
Output: ["abc", "bcd", "cdb", "dbc"]
Explanation:
The substrings with distinct characters are abc, bcd, cdb, dbc, and again bcd. However, we are only looking for unique substrings, so we discard the last one.

Constraints:
k is a positive number less than or equal to 26.
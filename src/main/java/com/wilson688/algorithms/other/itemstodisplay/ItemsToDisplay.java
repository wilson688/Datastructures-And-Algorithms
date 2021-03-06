package com.wilson688.algorithms.other.itemstodisplay;

/*
A search engine website wants to implement a new feature that allows their users to sort their search results.

Each search result consists of a URL, a timestamp, and a relevance score. Given an array of results, the name of the column to sort by, the sort order (ascending or descending), the page number, and size of each page, implement a function that returns a list of results.

Input
sortColumn: a number representing the column to sort by: 0 = URL, 1 = timestamp, 2 = relevance

sortOrder: a number representing the sort order: 0 = ascending, 1 = descending

pageSize: the number of results that is required to be displayed on a single page

pageIndex: the page number, starting from 0

results: a map of URL strings to tuples representing the (relevance, timestamp)

Output
Return a list of URLs to be displayed.

Note
pageSize is never zero, and is always less than the number of results.

Examples
Example 1:
Input:
sortColumn = 1

sortOrder = 0

pageSize = 2

pageIndex = 1

results = [["foo.com", 10, 15], ["bar.com", 3, 4]. ["baz.com", 17, 8]]

Output: ["baz"]
Explanation:
There are 3 results.

Sort them by timestamp (sortColumn = 1) in ascending order results = [["bar.com", 3, 4], ["foo.com", 10, 15], ["baz.com", 17, 8]].

Display up to 2 results on each page.

The page 0 contains 2 results ["bar.com", "foo.com"] and page 1 contains only 1 result ["baz.com"].

Therefore, the output is ["baz.com"].


 */

public class ItemsToDisplay {
}

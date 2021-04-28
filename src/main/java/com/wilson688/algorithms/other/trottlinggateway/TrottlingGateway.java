package com.wilson688.algorithms.other.trottlinggateway;

/*
You are an employee of a bank that is forced to cut operating costs by throttling the number of transactions.

You are tasked with figuring out what the damage would be in a gateway with the following limits:

No more than 3 transactions per second
No more than 20 transactions per 10 second window
No more than 60 transactions per 60 second window Note: The 60 second window starts immediately, ie. For t = 30, there may not be more than 60 transactions between t = 1 and t = 30, just as there may not be more than 60 transactions between t = 30 and t = 90. The same applies for the 10 second window.
Find the minimum number of transactions that could not possibly be processed given a list of transaction times.

Input
transactionTime = list of timestamps representing a transaction

Output
A number representing the total number of transactions lost. Note that an unprocessed transaction still counts towards the limits, even though it has been lost.

Examples
Example 1:
Input:
transactionTime = [1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 11, 11, 11, 11]

Output: 7
Explanation:
Transaction 1, 1, 1 - Within limits.

Transaction 1 - Not processed. No more than 3 transactions per second.

All transactions from 2 to 6 are processed because they follow the "no more than 3 transactions per second" rule and do not exceed the "20 transactions in 10 seconds" limit.

Transaction 7 - Processed, but the total number of transactions has reached 20.

Transaction 7, 7, 7 - Not processed. No more than 20 transactions per 10 second window.

Transaction 11 - Processed. The 10 second window has changed from 2 to 11.

Transaction 11, 11, 11 - Not processed. The total number of transactions for the 10 second window has again reached 20.

A total of 7 transactions are not processed.
 */
public class TrottlingGateway {
}

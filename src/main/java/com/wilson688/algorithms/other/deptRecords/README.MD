An international organization is investigating debt across countries. Given a list of records representing amounts of money owed between each country, find the country with the largest negative balance.

Return the list consisting of the string "No countries have debt." if all countries zero out their owed amounts.

Input
debts: an array consisting of borrower country string, lender country string, amount number triplets, each representing a debt record.

Output
A list of countries with the largest debt. If there are multiple countries with the same maximum debt amount, sort them alphabetically.

Return a list containing the string "No countries have debt." if there is no debt.

Example
```aidl
| Borrower  |  Lender	|  Amount
|-----------|-----------|--------
| USA	    |  Canada	|  2
| Canada    |  USA	|  2
| Mexico    |  USA	|  5
| Canada    |  Mexico	|  7
| USA	    |  Canada	|  4
| USA	    |  Mexico	|  4
```
Explanation:
For USA:
The first, fifth, and sixth entries decrease the balance because they are a borrower.

The second and third entries increase because they are a lender.

Their balance is (2 + 5) - (2 + 4 + 4) = 7 - 10 = -3.

For Canada:
They are a lender in first and fifth entries and a borrower in the second and fourth entries.

Their balance is (2 + 4) - (2 + 7) = 6 - 9 = -3.

For Mexico:
They are a borrower in the third entry and a lender in the fourth and sixth entries.

Thus, Mexico's balance is (7 + 4) - 5 = 11 - 6 = 5.

Here USA and Canada both have the balance of -3, which is the minimum net balance among all countries.
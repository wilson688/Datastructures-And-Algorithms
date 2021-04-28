package com.wilson688.algorithms.other.numbergame___________;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
You are playing a card game with your friends. Every card is marked with a positive integer. You start the game with 2N cards on your hand, and the game lasts N rounds.
In each round, you have to remove 2 cards from your hand.

Your score in each round is gcd(card, card2) * round_number, where card and card2 are the cards that you removed and round_number is the current round.
Your total score will be the sum of the scores that you received in each round.

What is the maximum total score that you can get?

Constraints
1 <= n <= 10, n represents the total number of rounds.

1 <= cards[i] <= 10^9, cards represents the array of the cards on your hand, and cards[i] represents the positive integer marked on card i.

The round_number starts from 1.

Examples
Example 1:
Input:
n = 3

cards = [8, 5, 6, 25, 6, 16]

Output: 41
Explanation:
The game can proceed as follow:

round_number 1: remove card = 5, card2 = 25, so gcd(5, 25) * round_number = 5 * 1 = 5.
round_number 2: remove card = 6, card2 = 6, so gcd(6, 6) * round_number = 6 * 2 = 12.
round_number 3: remove card = 8, card2 = 16, so gcd(8, 16) * round_number = 8 * 3 = 24.
The maximum total score is 5 + 12 + 24 = 41.

Example 2:
Input:
n = 4

cards = [2, 3, 8, 6]

round_number 1: card1 2, card2 = 8, so gcd(2, 8) * round_number = 2*1 = 2
round_number 2: card1 = 3, card2= 6, so gcd(3,6)* round_number = 3*2 = 6
total sum = 2+6 = 8


Example 3:
Input:
n = 3

 */
public class NumberGame {


    public int maxScore(int n, int[] cards) {
        int maxScore = 0;

        int[] used = new int[n*2];
        Arrays.fill(used,1);
        List<Integer> local_sums = new ArrayList<>();
        int previous_sum = 0;

        for (int i = 0; i < cards.length; i++) {
            int local_max = 0;
            int adjacent_pair = i;
           for (int j = i + 1; j < cards.length; j++) {
               if (used[i] != 0 && used[j] != 0) {
                   int sub_local_max = gcd(cards[i], cards[j]);
                   if (local_max < sub_local_max) {
                       local_max = sub_local_max;
                       adjacent_pair = j;
                   }
               }
           }
            used[i] = 0;
            used[adjacent_pair] = 0;
            if (local_max > 0) local_sums.add(local_max);
        }

        local_sums.sort( (a, b) -> a - b);

        for (int i = 0; i < local_sums.size(); i++) {
            maxScore += local_sums.get(i) * (i + 1);
        }

        return maxScore;
    }

    private int gcd(int a, int b) {
        if (a == 0) return b;

        return gcd(b % a, a);
    }


    public static void main(String[] args) {
        NumberGame numberGame = new NumberGame();
        System.out.println(numberGame.maxScore(3, new int[] {8, 5, 6, 25, 6, 16}));
        System.out.println(numberGame.maxScore(2, new int[] {2, 3, 8, 6}));
    }

}

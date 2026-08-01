/*
LeetCode #121 - Best Time to Buy and Sell Stock

Difficulty: Easy

Approach:
Greedy

1. Keep track of the minimum stock price seen so far.
2. For each day's price, calculate the profit if sold on that day.
3. Update the maximum profit whenever a larger profit is found.
4. Return the maximum profit after traversing all prices.

Time Complexity: O(n)
Space Complexity: O(1)

where n = number of days.
*/

class Solution {

    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            minPrice = Math.min(minPrice, price);

            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }
}

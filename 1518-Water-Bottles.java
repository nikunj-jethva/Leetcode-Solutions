/*
LeetCode #1518 - Water Bottles

Difficulty: Easy

Approach:
Simulation

1. Start with the initial number of full bottles.
2. Drink all the bottles and count them.
3. Exchange empty bottles for new full bottles whenever possible.
4. Add the newly obtained bottles to the answer.
5. Repeat until no more exchanges can be made.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {

    public int numWaterBottles(int numBottles, int numExchange) {

        int ans = numBottles;

        while (numBottles >= numExchange) {

            int newBottles = numBottles / numExchange;
            int remaining = numBottles % numExchange;

            ans += newBottles;
            numBottles = newBottles + remaining;
        }

        return ans;
    }
}

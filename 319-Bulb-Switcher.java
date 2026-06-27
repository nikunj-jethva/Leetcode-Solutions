/*
LeetCode #319 - Bulb Switcher

Difficulty: Medium

Approach:
Mathematical Observation

Only bulbs at perfect square positions remain ON.

Reason:
- A bulb is toggled once for every divisor it has.
- Most numbers have divisors in pairs, resulting in an even number of toggles.
- Perfect squares have one unpaired divisor, giving them an odd number of toggles.

Therefore, the answer is simply the number of perfect squares less than
or equal to n.

Time Complexity: O(√n)
Space Complexity: O(1)
*/

class Solution {

    public int bulbSwitch(int n) {

        int count = 0;
        int i = 1;

        while (i * i <= n) {
            count++;
            i++;
        }

        return count;
    }
}

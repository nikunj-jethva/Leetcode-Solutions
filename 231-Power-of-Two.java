/*
LeetCode #231 - Power of Two

Difficulty: Easy

Approach:
Repeated Division

Keep dividing the number by 2 while it is even.
If the final value becomes 1, then the number is
a power of two.

Examples:
8  -> 4 -> 2 -> 1  => true
10 -> 5            => false

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {

    public boolean isPowerOfTwo(int n) {

        if (n < 1) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        return n == 1;
    }
}

/*
LeetCode #7 - Reverse Integer
https://leetcode.com/problems/reverse-integer/

Difficulty: Medium

Approach:
Mathematical Reversal

Extract digits one by one using modulo (% 10),
build the reversed number, and check for overflow
before multiplying by 10.

Time Complexity: O(log₁₀(n))
Space Complexity: O(1)
*/

class Solution {
    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {

            if (reversed > Integer.MAX_VALUE / 10 ||
                reversed < Integer.MIN_VALUE / 10) {
                return 0;
            }

            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return reversed;
    }
}

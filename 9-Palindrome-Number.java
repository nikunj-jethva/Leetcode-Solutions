/*
LeetCode #9 - Palindrome Number
https://leetcode.com/problems/palindrome-number/

Difficulty: Easy

Approach:
Reverse the number and compare it with the original number.
Negative numbers cannot be palindromes.

Time Complexity: O(log₁₀(n))
Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int n = x;
        int rev = 0;

        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }

        return rev == x;
    }
}

/*
LeetCode #8 - String to Integer (atoi)
https://leetcode.com/problems/string-to-integer-atoi/

Difficulty: Medium

Approach:
Parse the string step by step:
1. Skip leading whitespaces.
2. Determine the sign.
3. Convert digits into an integer.
4. Handle overflow before updating the result.
5. Stop when a non-digit character is encountered.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        int index = 0;

        // Skip whitespace
        while (index < s.length() && s.charAt(index) == ' ')
            index++;

        if (index == s.length())
            return 0;

        // Check sign
        int sign = 1;

        if (s.charAt(index) == '+')
            index++;
        else if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        }

        // Build number with overflow check
        int result = 0;

        while (index < s.length()) {
            char c = s.charAt(index);

            if (c < '0' || c > '9')
                break;

            if (result > Integer.MAX_VALUE / 10 ||
               (result == Integer.MAX_VALUE / 10 && c > '7')) {
                return sign == 1
                        ? Integer.MAX_VALUE
                        : Integer.MIN_VALUE;
            }

            result = result * 10 + (c - '0');
            index++;
        }

        return sign * result;
    }
}

/*
LeetCode #12 - Integer to Roman
https://leetcode.com/problems/integer-to-roman/

Difficulty: Medium

Approach:
Greedy

Store Roman numeral values and symbols in descending order.
Repeatedly subtract the largest possible value and append
its corresponding Roman symbol until the number becomes 0.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Solution {
    public String intToRoman(int num) {

        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(symbols[i]);
            }
        }

        return result.toString();
    }
}

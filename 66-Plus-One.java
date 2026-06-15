/*
LeetCode #66 - Plus One

Difficulty: Easy

Approach:
Simulation

Start from the last digit:
1. If the digit is less than 9, increment it and return.
2. If the digit is 9, set it to 0 and carry over.
3. If all digits are 9, create a new array with an extra digit.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;

        if (digits[n - 1] != 9) {
            digits[n - 1] = digits[n - 1] + 1;
            return digits;
        }

        digits[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {

            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }

            digits[i] = 0;
        }

        int[] ans = new int[n + 1];
        ans[0] = 1;

        return ans;
    }
}

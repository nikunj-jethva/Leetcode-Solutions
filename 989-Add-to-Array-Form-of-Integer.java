/*
LeetCode #989 - Add to Array-Form of Integer

Difficulty: Easy

Approach:
Simulation

1. Start from the last digit of the array.
2. Add the current digit, the last digit of k, and the carry.
3. Store the last digit of the sum in the answer.
4. Update the carry and continue until all digits are processed.
5. Reverse the result before returning.

Time Complexity: O(max(n, log k))
Space Complexity: O(max(n, log k))
*/

import java.util.*;

class Solution {

    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> ans = new ArrayList<>();

        int p = num.length - 1;
        int carry = 0;

        while (p >= 0 || k > 0 || carry > 0) {

            int numVal = 0;

            if (p >= 0) {
                numVal = num[p];
                p--;
            }

            int digit = k % 10;
            k /= 10;

            int sum = numVal + digit + carry;

            ans.add(sum % 10);
            carry = sum / 10;
        }

        Collections.reverse(ans);

        return ans;
    }
}

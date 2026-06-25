/*
LeetCode #268 - Missing Number

Difficulty: Easy

Approach:
Mathematical Formula

The numbers are in the range [0, n].

1. Calculate the expected sum of numbers from 0 to n.
2. Calculate the actual sum of elements in the array.
3. The difference between the two sums is the missing number.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int missingNumber(int[] nums) {

        int n = nums.length;

        int expectedSum = (n * (n + 1)) / 2;

        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }

        return expectedSum - actualSum;
    }
}

/*
LeetCode #1464 - Maximum Product of Two Elements in an Array

Difficulty: Easy

Approach:
Single Pass

1. Traverse the array once.
2. Keep track of the largest and second largest elements.
3. Calculate (max - 1) × (secondMax - 1).
4. Return the result.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int maxProduct(int[] nums) {

        int max = -1;
        int secondMax = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return (max - 1) * (secondMax - 1);
    }
}

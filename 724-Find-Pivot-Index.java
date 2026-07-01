/*
LeetCode #724 - Find Pivot Index

Difficulty: Easy

Approach:
Prefix Sum

1. Calculate the total sum of the array.
2. Traverse the array while maintaining the left sum.
3. Subtract the current element from the right sum.
4. If the left sum equals the right sum, return the current index.
5. Otherwise, update the left sum and continue.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int pivotIndex(int[] nums) {

        int rightSum = 0;

        for (int num : nums) {
            rightSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {

            rightSum -= nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}

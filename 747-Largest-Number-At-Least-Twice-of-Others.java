/*
LeetCode #747 - Largest Number At Least Twice of Others

Difficulty: Easy

Approach:
Single Pass

1. Track the largest and second largest elements.
2. Update their values while traversing the array.
3. Store the index of the largest element.
4. After traversal, check if the largest element is at least twice the second largest.
5. Return the index if the condition is satisfied; otherwise return -1.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int dominantIndex(int[] nums) {

        int max = -1;
        int secondMax = -1;
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        if (max >= 2 * secondMax) {
            return maxIndex;
        }

        return -1;
    }
}

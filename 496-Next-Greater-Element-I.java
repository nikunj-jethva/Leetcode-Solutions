/*
LeetCode #496 - Next Greater Element I

Difficulty: Easy

Approach:
Brute Force

1. For each element in nums1, find its position in nums2.
2. Continue searching to the right in nums2.
3. Return the first element greater than the current element.
4. If no greater element exists, return -1.

Time Complexity: O(n × m)
Space Complexity: O(1)
*/

class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            int currentVal = nums1[i];
            int nextGreater = -1;
            boolean foundMatch = false;

            for (int j = 0; j < nums2.length; j++) {

                if (nums2[j] == currentVal) {
                    foundMatch = true;
                }

                if (foundMatch && nums2[j] > currentVal) {
                    nextGreater = nums2[j];
                    break;
                }
            }

            result[i] = nextGreater;
        }

        return result;
    }
}

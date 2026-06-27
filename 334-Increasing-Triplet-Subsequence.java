/*
LeetCode #334 - Increasing Triplet Subsequence

Difficulty: Medium

Approach:
Greedy

Maintain the smallest and second smallest elements.

1. Update the first minimum element.
2. Update the second minimum element if possible.
3. If an element is greater than both, an increasing
   triplet exists.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {

            if (num <= first) {

                first = num;

            } else if (num <= second) {

                second = num;

            } else {

                return true;
            }
        }

        return false;
    }
}

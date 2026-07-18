/*
LeetCode #2089 - Find Target Indices After Sorting Array

Difficulty: Easy

Approach:
Counting

1. Count how many numbers are smaller than the target.
2. Count how many times the target appears.
3. The first target index after sorting equals the count of smaller elements.
4. Add consecutive indices for every occurrence of the target.
5. Return the list of indices.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public List<Integer> targetIndices(int[] nums, int target) {

        int smaller = 0;
        int targetCount = 0;

        for (int num : nums) {

            if (num < target) {
                smaller++;
            } else if (num == target) {
                targetCount++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        while (targetCount-- > 0) {
            ans.add(smaller++);
        }

        return ans;
    }
}

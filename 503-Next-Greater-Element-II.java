/*
LeetCode #503 - Next Greater Element II

Difficulty: Medium

Approach:
Monotonic Stack

1. Use a monotonic decreasing stack to store indices.
2. Traverse the array twice to simulate a circular array.
3. While the current element is greater than the element at the
   top index of the stack, update its next greater element.
4. Push indices only during the first traversal.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Arrays;
import java.util.Stack;

class Solution {

    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {

            int current = nums[i % n];

            while (!stack.isEmpty() && nums[stack.peek()] < current) {
                result[stack.pop()] = current;
            }

            if (i < n) {
                stack.push(i);
            }
        }

        return result;
    }
}

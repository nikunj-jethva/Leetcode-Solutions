/*
LeetCode #739 - Daily Temperatures

Difficulty: Medium

Approach:
Monotonic Stack

1. Use a stack to store indices of temperatures.
2. Traverse the array from left to right.
3. While the current temperature is greater than the temperature
   at the index on top of the stack, pop the index and calculate
   the number of days waited.
4. Push the current index onto the stack.
5. Indices left in the stack have no warmer future day.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Stack;

class Solution {

    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return answer;
    }
}

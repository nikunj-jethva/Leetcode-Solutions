/*
LeetCode #20 - Valid Parentheses
https://leetcode.com/problems/valid-parentheses/

Difficulty: Easy

Approach:
Stack

Push opening brackets onto the stack.
When a closing bracket is encountered,
check if it matches the most recent opening bracket.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {

                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if (!isMatch(top, c))
                    return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean isMatch(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}

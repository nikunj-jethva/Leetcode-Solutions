/*
LeetCode #921 - Minimum Add to Make Parentheses Valid

Difficulty: Medium

Approach:
Stack

1. Traverse the string character by character.
2. Push every opening parenthesis '(' onto the stack.
3. For each closing parenthesis ')':
   - If the stack is not empty, pop one opening parenthesis.
   - Otherwise, increment the count of required opening parentheses.
4. After the traversal, any remaining opening parentheses in the stack also need matching closing parentheses.
5. Return the sum of unmatched opening parentheses and the required opening parentheses.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (!stack.isEmpty()) {
                stack.pop();
            } else {
                count++;
            }
        }

        return stack.size() + count;
    }
}

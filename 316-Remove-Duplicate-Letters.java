/*
LeetCode #316 - Remove Duplicate Letters

Difficulty: Medium

Approach:
Monotonic Stack + Greedy

1. Store the last occurrence of every character.
2. Traverse the string.
3. If the current character is already in the stack, skip it.
4. Otherwise, remove larger characters from the stack if they
   appear again later in the string.
5. Push the current character into the stack.

The resulting string is the smallest lexicographical string
containing each letter exactly once.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Stack;

class Solution {

    public String removeDuplicateLetters(String s) {

        int[] lastIndex = new int[26];

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        boolean[] present = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            int index = ch - 'a';

            if (present[index]) {
                continue;
            }

            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && lastIndex[stack.peek() - 'a'] > i) {

                present[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            present[index] = true;
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }
}

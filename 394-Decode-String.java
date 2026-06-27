/*
LeetCode #394 - Decode String

Difficulty: Medium

Approach:
Stack

1. Use one stack to store repetition counts.
2. Use another stack to store characters and partial strings.
3. When a closing bracket ']' is encountered:
   - Pop characters until '[' is found.
   - Repeat the extracted string according to the stored count.
   - Push the expanded string back onto the stack.
4. Build the final decoded string from the stack.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Stack;

class Solution {

    public String decodeString(String s) {

        Stack<Integer> number = new Stack<>();
        Stack<String> main = new Stack<>();

        int n = s.length();

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {

                int num = 0;

                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }

                i--;
                number.push(num);

            } else if (ch != ']') {

                main.push(ch + "");

            } else {

                String str = "";

                while (!main.peek().equals("[")) {
                    str = main.pop() + str;
                }

                main.pop(); // Remove '['

                int repeat = number.pop();

                StringBuilder sb = new StringBuilder();

                while (repeat-- > 0) {
                    sb.append(str);
                }

                main.push(sb.toString());
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!main.isEmpty()) {
            ans.insert(0, main.pop());
        }

        return ans.toString();
    }
}

/*
LeetCode #443 - String Compression

Difficulty: Medium

Approach:
String Traversal

1. Traverse the character array.
2. Count consecutive occurrences of each character.
3. Append the character to the result.
4. If the count is greater than 1, append the count.
5. Copy the compressed string back into the original array.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public int compress(char[] chars) {

        StringBuilder sb = new StringBuilder();

        int count = 1;
        sb.append(chars[0]);

        for (int i = 1; i < chars.length; i++) {

            if (chars[i - 1] != chars[i]) {

                if (count > 1) {
                    sb.append(count);
                }

                sb.append(chars[i]);
                count = 1;

            } else {
                count++;
            }
        }

        // Handle the last group
        if (count > 1) {
            sb.append(count);
        }

        // Copy the compressed string back to the array
        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}

/*
LeetCode #151 - Reverse Words in a String

Difficulty: Medium

Approach:
Split and Reverse

1. Split the string using one or more spaces.
2. Traverse the array from the end.
3. Append words in reverse order.
4. Remove trailing spaces using trim().

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public String reverseWords(String s) {

        String[] arr = s.split("\\s+");

        StringBuilder sb = new StringBuilder("");

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i] + " ");
        }

        String ans = sb.toString();

        ans = ans.trim();

        return ans;
    }
}

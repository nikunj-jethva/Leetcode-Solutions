/*
LeetCode #179 - Largest Number

Difficulty: Medium

Approach:
Custom Sorting

Convert all numbers to strings.

For two numbers a and b:
- Compare (b + a) with (a + b).
- Place the combination that forms the larger value first.

Example:
"9" + "34" = "934"
"34" + "9" = "349"

Since 934 > 349, "9" comes before "34".

After sorting:
1. Concatenate all strings.
2. Handle the edge case where all numbers are 0.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

class Solution {

    public String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(s);
        }

        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}

/*
LeetCode #1897 - Redistribute Characters to Make All Strings Equal

Difficulty: Easy

Approach:
Character Frequency Counting

1. Count the frequency of every character across all strings.
2. For each character, check whether its frequency is divisible by the number of strings.
3. If any character's frequency is not divisible, return false.
4. Otherwise, all characters can be evenly distributed among the strings.

Time Complexity: O(n)
Space Complexity: O(1)

where n is the total number of characters in all strings.
*/

class Solution {

    public boolean makeEqual(String[] words) {

        int[] freq = new int[26];

        for (String word : words) {

            for (int i = 0; i < word.length(); i++) {
                freq[word.charAt(i) - 'a']++;
            }
        }

        for (int count : freq) {

            if (count % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}

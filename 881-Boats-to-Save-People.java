/*
LeetCode #881 - Boats to Save People

Difficulty: Medium

Approach:
Greedy + Two Pointers

1. Sort the array of people's weights.
2. Use two pointers:
   - One at the lightest person.
   - One at the heaviest person.
3. If the lightest and heaviest can share a boat, move both pointers.
4. Otherwise, send the heaviest person alone.
5. Count one boat for each iteration.

Time Complexity: O(n log n)
Space Complexity: O(1) (excluding sorting)
*/

import java.util.Arrays;

class Solution {

    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int start = 0;
        int end = people.length - 1;
        int boats = 0;

        while (start <= end) {

            if (people[start] + people[end] <= limit) {
                start++;
                end--;
            } else {
                end--;
            }

            boats++;
        }

        return boats;
    }
}

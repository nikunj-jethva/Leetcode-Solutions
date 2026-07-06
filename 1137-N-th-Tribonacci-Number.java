/*
LeetCode #1137 - N-th Tribonacci Number

Difficulty: Easy

Approach:
Iterative Dynamic Programming

1. Handle the base cases for n = 0, 1, and 2.
2. Maintain the previous three Tribonacci numbers.
3. Iteratively compute the next Tribonacci number.
4. Return the nth Tribonacci number.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int tribonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i <= n; i++) {

            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }

        return a;
    }
}

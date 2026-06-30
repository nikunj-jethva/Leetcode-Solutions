/*
LeetCode #509 - Fibonacci Number

Difficulty: Easy

Approach:
Iterative Dynamic Programming

1. Handle the base cases for n = 0 and n = 1.
2. Maintain the previous two Fibonacci numbers.
3. Iteratively compute the next Fibonacci number.
4. Return the nth Fibonacci number.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int fib(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {

            int third = first + second;
            first = second;
            second = third;
        }

        return first;
    }
}

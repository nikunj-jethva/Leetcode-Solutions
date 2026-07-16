/*
LeetCode #1491 - Average Salary Excluding the Minimum and Maximum Salary

Difficulty: Easy

Approach:
Single Pass

1. Initialize the minimum, maximum, and total sum using the first salary.
2. Traverse the array once to update the minimum, maximum, and sum.
3. Subtract the minimum and maximum salaries from the total sum.
4. Divide the remaining sum by (n - 2) to get the average.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public double average(int[] salary) {

        int max = salary[0];
        int min = salary[0];
        int sum = salary[0];

        for (int i = 1; i < salary.length; i++) {

            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
            sum += salary[i];
        }

        sum = sum - max - min;

        return (double) sum / (salary.length - 2);
    }
}

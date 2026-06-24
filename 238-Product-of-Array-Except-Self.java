/*
LeetCode #238 - Product of Array Except Self

Difficulty: Medium

Approach:
Prefix and Suffix Products

1. Build a suffix product array.
2. Maintain a running prefix product.
3. For each index:
   - Answer = Prefix Product × Suffix Product
4. No division is used.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] right = new int[n];
        int product = 1;

        // Suffix products
        for (int i = n - 1; i >= 0; i--) {
            product *= nums[i];
            right[i] = product;
        }

        int[] ans = new int[n];
        int left = 1;

        // Prefix × Suffix
        for (int i = 0; i < n - 1; i++) {

            ans[i] = left * right[i + 1];

            left *= nums[i];
        }

        ans[n - 1] = left;

        return ans;
    }
}

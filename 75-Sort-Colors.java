/*
LeetCode #75 - Sort Colors

Difficulty: Medium

Approach:
Dutch National Flag Algorithm

Maintain three pointers:
1. low  -> next position for 0
2. mid  -> current element
3. high -> next position for 2

Traverse the array once and place:
- 0s at the beginning
- 1s in the middle
- 2s at the end

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}

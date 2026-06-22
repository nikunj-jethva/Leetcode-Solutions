/*
LeetCode #215 - Kth Largest Element in an Array

Difficulty: Medium

Approach:
Min Heap (Priority Queue)

Maintain a min heap of size k.

1. Add elements until heap size becomes k.
2. For remaining elements:
   - If current element is larger than the minimum,
     remove the minimum and insert the current element.
3. The root of the heap will be the kth largest element.

Time Complexity: O(n log k)
Space Complexity: O(k)
*/


class Solution {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {

            if (pq.size() < k) {

                pq.add(nums[i]);

            } else if (pq.peek() < nums[i]) {

                pq.remove();
                pq.add(nums[i]);
            }
        }

        return pq.peek();
    }
}

/*
LeetCode #1046 - Last Stone Weight

Difficulty: Easy

Approach:
Max Heap (Priority Queue)

1. Insert all stones into a max heap.
2. Repeatedly remove the two heaviest stones.
3. If their weights are different, insert the difference back into the heap.
4. Continue until at most one stone remains.
5. Return the remaining stone's weight, or 0 if no stones remain.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/


class Solution {

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {

            int first = pq.poll();
            int second = pq.poll();

            if (first != second) {
                pq.offer(first - second);
            }
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }
}

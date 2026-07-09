/*
LeetCode #23 - Merge k Sorted Lists

Difficulty: Hard

Approach:
Priority Queue (Min Heap)

1. Handle edge cases for empty or single list.
2. Insert all nodes from every linked list into a min heap.
3. Repeatedly remove the smallest node from the heap.
4. Attach the removed node to the merged linked list.
5. Return the merged list.

Time Complexity: O(N log N)
Space Complexity: O(N)

where N is the total number of nodes across all linked lists.
*/

import java.util.PriorityQueue;

class Solution {

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0) {
            return null;
        }

        if (lists.length == 1) {
            return lists[0];
        }

        PriorityQueue<ListNode> pq =
                new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode head : lists) {

            while (head != null) {
                pq.offer(head);
                head = head.next;
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (!pq.isEmpty()) {

            ListNode node = pq.poll();
            current.next = node;
            current = current.next;
        }

        current.next = null;

        return dummy.next;
    }
}

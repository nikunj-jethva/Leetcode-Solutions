/*
LeetCode #141 - Linked List Cycle

Difficulty: Easy

Approach:
Floyd's Cycle Detection (Tortoise and Hare)

1. Handle empty and single-node linked lists.
2. Use two pointers:
   - Slow moves one step at a time.
   - Fast moves two steps at a time.
3. If the pointers meet, a cycle exists.
4. If the fast pointer reaches the end, there is no cycle.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class Solution {

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}

/*
LeetCode #2095 - Delete the Middle Node of a Linked List

Difficulty: Medium

Approach:
Fast & Slow Pointers

1. If the list contains only one node, return null.
2. Use two pointers:
   - Fast moves two steps at a time.
   - Slow moves one step at a time.
3. Keep a previous pointer to the node before slow.
4. When fast reaches the end, slow points to the middle node.
5. Remove the middle node by updating previous.next.
6. Return the modified head.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public ListNode deleteMiddle(ListNode head) {

        if (head.next == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = head;

        while (fast != null && fast.next != null) {

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = prev.next.next;

        return head;
    }
}

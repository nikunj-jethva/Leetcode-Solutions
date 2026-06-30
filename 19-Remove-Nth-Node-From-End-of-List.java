/*
LeetCode #19 - Remove Nth Node From End of List

Difficulty: Medium

Approach:
Two Pointers

1. Move the fast pointer n steps ahead.
2. If the fast pointer becomes null, remove the head node.
3. Move both fast and slow pointers together until fast reaches the last node.
4. Remove the target node by updating the next pointer.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (n > 0) {
            fast = fast.next;
            n--;
        }

        if (fast == null) {
            return head.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}

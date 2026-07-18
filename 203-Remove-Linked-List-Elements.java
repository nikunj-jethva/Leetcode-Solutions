/*
LeetCode #203 - Remove Linked List Elements

Difficulty: Easy

Approach:
Dummy Node + Linked List Traversal

1. Create a dummy node pointing to the head.
2. Traverse the list using a pointer starting from the dummy node.
3. If the next node's value matches the target value, remove it.
4. Otherwise, move to the next node.
5. Return dummy.next as the new head.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = dummy;

        while (curr.next != null) {

            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}

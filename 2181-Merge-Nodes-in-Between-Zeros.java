/*
LeetCode #2181 - Merge Nodes in Between Zeros

Difficulty: Medium

Approach:
Linked List Traversal

1. Traverse the linked list starting after the first zero.
2. Keep adding node values until another zero is encountered.
3. Create a new node with the accumulated sum.
4. Reset the sum and continue for the next segment.
5. Return the newly formed linked list.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public ListNode mergeNodes(ListNode head) {

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        ListNode curr = head.next;
        int sum = 0;

        while (curr != null) {

            if (curr.val != 0) {
                sum += curr.val;
            } else {
                tail.next = new ListNode(sum);
                tail = tail.next;
                sum = 0;
            }

            curr = curr.next;
        }

        return dummy.next;
    }
}

/*
LeetCode #83 - Remove Duplicates from Sorted List

Difficulty: Easy

Approach:
Create a New Linked List

1. Handle empty and single-node lists.
2. Create a new list with the first node.
3. Traverse the original list.
4. Add a node only when its value differs from the last inserted value.
5. Return the new list containing unique elements.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(head.val);
        ListNode ans = dummy;
        ListNode ptr = head.next;

        while (ptr != null) {

            if (ptr.val != dummy.val) {

                ListNode temp = new ListNode(ptr.val);
                dummy.next = temp;
                dummy = dummy.next;
            }

            ptr = ptr.next;
        }

        return ans;
    }
}

/*
LeetCode #328 - Odd Even Linked List

Difficulty: Medium

Approach:
Linked List Pointer Manipulation

1. Handle edge cases for lists with fewer than three nodes.
2. Maintain separate pointers for odd and even indexed nodes.
3. Rearrange the next pointers to group all odd-indexed nodes together.
4. Connect the end of the odd list to the head of the even list.
5. Return the modified linked list.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {

            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}

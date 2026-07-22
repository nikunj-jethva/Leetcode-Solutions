/*
LeetCode #2816 - Double a Number Represented as a Linked List

Difficulty: Medium

Approach:
Reverse Linked List + Simulation

1. Reverse the linked list to process digits from least significant to most significant.
2. Traverse the reversed list and double each digit while maintaining a carry.
3. Create a new linked list to store the doubled digits.
4. If a carry remains after processing all digits, append it.
5. Reverse the resulting list to restore the original digit order.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public ListNode reverse(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode doubleIt(ListNode head) {

        ListNode reversed = reverse(head);

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        int carry = 0;

        while (reversed != null) {

            int sum = reversed.val * 2 + carry;

            tail.next = new ListNode(sum % 10);
            tail = tail.next;

            carry = sum / 10;
            reversed = reversed.next;
        }

        if (carry > 0) {
            tail.next = new ListNode(carry);
        }

        return reverse(dummy.next);
    }
}

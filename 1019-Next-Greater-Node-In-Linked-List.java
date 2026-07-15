/*
LeetCode #1019 - Next Greater Node In Linked List

Difficulty: Medium

Approach:
Reverse Linked List + Monotonic Stack

1. Count the number of nodes in the linked list.
2. Reverse the linked list.
3. Traverse the reversed list while maintaining a monotonic decreasing stack.
4. Remove all elements from the stack that are less than or equal to the current value.
5. The top of the stack is the next greater node; if the stack is empty, the answer is 0.
6. Store the results from back to front and return the array.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Stack;

class Solution {

    public int size(ListNode head) {

        ListNode curr = head;
        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }

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

    public int[] nextLargerNodes(ListNode head) {

        if (head == null) {
            return new int[0];
        }

        int size = size(head);
        int[] ans = new int[size];

        ListNode reversedHead = reverse(head);

        Stack<Integer> stack = new Stack<>();

        ans[size - 1] = 0;
        stack.push(reversedHead.val);

        ListNode curr = reversedHead.next;
        int index = size - 2;

        while (index >= 0) {

            int value = curr.val;
            curr = curr.next;

            while (!stack.isEmpty() && stack.peek() <= value) {
                stack.pop();
            }

            ans[index] = stack.isEmpty() ? 0 : stack.peek();

            stack.push(value);
            index--;
        }

        return ans;
    }
}

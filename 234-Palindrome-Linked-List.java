/*
LeetCode #234 - Palindrome Linked List

Difficulty: Easy

Approach:
Stack

1. Traverse the linked list and push every node's value onto a stack.
2. Traverse the linked list again from the head.
3. Compare each node's value with the top of the stack.
4. If any values differ, return false.
5. If all values match, return true.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Stack;

class Solution {

    public boolean isPalindrome(ListNode head) {

        Stack<Integer> stack = new Stack<>();

        ListNode current = head;

        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        current = head;

        while (current != null) {

            if (current.val != stack.pop()) {
                return false;
            }

            current = current.next;
        }

        return true;
    }
}

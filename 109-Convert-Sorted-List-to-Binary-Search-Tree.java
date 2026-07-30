/*
LeetCode #109 - Convert Sorted List to Binary Search Tree

Difficulty: Medium

Approach:
Recursion + Fast & Slow Pointers

1. Find the middle node of the linked list using fast and slow pointers.
2. The middle node becomes the root of the BST.
3. Split the linked list into two halves.
4. Recursively construct the left subtree from the left half.
5. Recursively construct the right subtree from the right half.
6. Return the root.

Time Complexity: O(n log n)
Space Complexity: O(log n)

where n = number of nodes in the linked list.
*/

class Solution {

    public ListNode middleNode(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = slow;

        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        pre.next = null;

        return slow;
    }

    public TreeNode sortedListToBST(ListNode head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return new TreeNode(head.val);
        }

        ListNode mid = middleNode(head);

        TreeNode root = new TreeNode(mid.val);

        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);

        return root;
    }
}

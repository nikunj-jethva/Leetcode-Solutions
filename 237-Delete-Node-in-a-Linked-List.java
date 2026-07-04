/*
LeetCode #237 - Delete Node in a Linked List

Difficulty: Easy

Approach:
Overwrite and Skip

1. Copy the value of the next node into the current node.
2. Skip the next node by updating the current node's next pointer.
3. The given node is effectively deleted without access to the head.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Solution {

    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;
    }
}

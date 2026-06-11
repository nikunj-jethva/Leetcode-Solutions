/*
LeetCode #21 - Merge Two Sorted Lists
https://leetcode.com/problems/merge-two-sorted-lists/

Difficulty: Easy

Approach:
Iterative Linked List Merge

Use a dummy node and compare nodes from both lists.
Attach the smaller node to the result list and move forward.
Finally, attach the remaining nodes.

Time Complexity: O(n + m)
Space Complexity: O(1)

where:
n = length of list1
m = length of list2
*/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }

        curr.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
}

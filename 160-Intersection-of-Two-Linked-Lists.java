/*
LeetCode #160 - Intersection of Two Linked Lists

Difficulty: Easy

Approach:
Two Pointers

Use two pointers traversing both lists.
When a pointer reaches the end of a list,
redirect it to the head of the other list.

This equalizes the distance traveled by both
pointers and guarantees they meet at the
intersection node (or null if no intersection exists).

Time Complexity: O(m + n)
Space Complexity: O(1)

where:
m = length of list A
n = length of list B
*/

class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {

            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }
}

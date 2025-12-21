/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//----- using recursion------

// class Solution {
// public ListNode reverseList(ListNode head) {
// if (head == null)
// return null;
// if (head.next == null)
// return head;
// ListNode newHead = reverseList(head.next);
// head.next.next = head;
// head.next = null;
// return newHead;
// }
// }

//----- Using Pointers------
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode nex = null;
        while (curr != null) {
            nex = curr.next; // Store next node
            curr.next = prev; // Reverse the current node's pointer
            prev = curr; // Move prev to current node
            curr = nex; // Move to next node
        }
        return prev; // Return new head of the reversed list
    }
}
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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next == null || left == right) {
            return head;
        }
        ListNode temp = new ListNode(0);   //garbage value
        temp.next = head;
        ListNode prev = temp;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        ListNode start = prev.next;
        ListNode second = start.next;
        // Reverse the sublist from m to n
        for (int i = 0; i < right - left; i++) {
            start.next = second.next;
            second.next = prev.next;
            prev.next = second;
            second = start.next;
        }

        return temp.next;
    }
}
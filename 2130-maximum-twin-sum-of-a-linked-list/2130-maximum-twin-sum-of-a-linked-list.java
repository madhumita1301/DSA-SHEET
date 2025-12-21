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

    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next.next != null) { // list is of even size
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reverseList(slow.next);
        slow.next = temp;
        int maxSum = 0; // any minimum value
        ListNode head1 = head;
        ListNode head2 = slow.next;
        while (head2 != null) {
            int sum = head1.val + head2.val;
            if (sum > maxSum) {
                maxSum = sum;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return maxSum;
    }
}
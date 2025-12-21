/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Step 1: Reverse both linked lists
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        ListNode dummy = new ListNode(0); // Dummy node to simplify the result list creation
        ListNode current = dummy; // Pointer to build the result list
        int carry = 0; // Variable to track the carry during addition

        // Step 2: Add the numbers digit by digit
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with the carry

            // Add the current digits if present
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Calculate the new carry and the current digit
            carry = sum / 10;
            int digit = sum % 10;

            // Create a new node with the current digit and move the pointer
            current.next = new ListNode(digit);
            current = current.next;
        }

        // Step 3: Reverse the result linked list to get the final answer
        return reverseList(dummy.next); //dummy is initialized w garbage value of 0
    }

    // Helper function to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }
}

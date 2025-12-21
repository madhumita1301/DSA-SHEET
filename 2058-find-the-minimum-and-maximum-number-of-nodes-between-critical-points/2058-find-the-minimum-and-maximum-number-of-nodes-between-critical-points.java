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



//  1 << 30: This is a bitwise left shift operation. It shifts the binary representation of 1 to the left by 30 positions. This is equivalent to 2^30 or  or 1073741824.
//This value is used as an initial "infinity" for the minimum distance calculation because it ensures that any valid distance found later will be smaller.


class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = { 1 << 30, 0 };
        int first = -1;
        int last = -1;
// This will run as long as there are at least three nodes available (the current node, the next node, and the node after that).
        for (int i = 0; head.next.next != null; head = head.next, ++i) {
            int a = head.val, b = head.next.val, c = head.next.next.val;
            // Check for critical point
            if (b < Math.min(a, c) || b > Math.max(a, c)) {
                if (last == -1) {
                    first = i;
                    last = i;
                } else {
                    ans[0] = Math.min(ans[0], i - last);
                    last = i;
                    ans[1] = Math.max(ans[1], last - first);
                }
            }
        }
        return first == last ? new int[] { -1, -1 } : ans;
    }
}


// ans[0] = Math.min(ans[0], i - last); // ans[0] = Math.min(2, 4 - 2) = 2
// last = i; // last = 4
// ans[1] = Math.max(ans[1], last - first); // ans[1] = Math.max(2, 4 - 0) = 4

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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;       // null
        ListNode curr = head;   // 1
        
        while (curr != null) {
            ListNode tempNext = curr.next;  // 2
            curr.next = prev;   // 1->null
            prev = curr;        // 
            curr = tempNext;   // 
        }
        
        return prev;
    }
}

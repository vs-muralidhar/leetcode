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
    public boolean isPalindrome(ListNode head) {
    
        if (head == null) return false;
        
        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode startOfSecondHalf = reverseList(firstHalfEnd.next);
        
        ListNode p1 = head;
        ListNode p2 = startOfSecondHalf;
        
        boolean result = true;
        while (true && p2 != null) {
            if (p1.val != p2.val) return false;
            p1=p1.next;
            p2=p2.next;
        }
        
        return result;
    }
    
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode tempNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNext;
        }
        return prev;
    }
    
    private ListNode endOfFirstHalf(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;       
    }
}

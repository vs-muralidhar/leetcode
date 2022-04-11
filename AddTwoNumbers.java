// Problem Statement : https://leetcode.com/problems/add-two-numbers/

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sentinelHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = sentinelHead;
        int carry = 0;
        while (p != null || q != null) {
            int val1 = (p != null) ? p.val : 0;
            int val2 = (q != null) ? q.val : 0;

            int sum = (carry + val1 + val2);
            carry = (sum) / 10;

            ListNode res = new ListNode(sum % 10);
            curr.next = res;
            curr = curr.next;

            p = (p != null) ? p.next : null;
            q = (q != null) ? q.next : null;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return sentinelHead.next;
    }
}
// Last updated: 14/07/2026, 14:02:21
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
        ListNode original = head;
        ListNode h2 = null;
        while (head != null) {
            ListNode temp = new ListNode(head.val); // create copy
            temp.next = h2;
            h2 = temp;
            head = head.next;
        }
        
        while (original != null && h2 != null) {
            if (original.val != h2.val) return false;
            original = original.next;
            h2 = h2.next;
        }
        return true;
    }
}
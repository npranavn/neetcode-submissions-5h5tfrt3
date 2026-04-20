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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = head;
        ListNode curr = head;
        int size = 0;
        while(dummy != null){
            dummy = dummy.next;
            size++;
        }
        if (n == size) {
            return head.next;
        }
        int trueVal = size - n - 1;
        for(int i = 0; i < trueVal; i++){
            head = head.next;
        }
        head.next = head.next.next;
        return curr;
    }
}

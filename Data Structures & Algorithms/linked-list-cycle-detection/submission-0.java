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
    public boolean hasCycle(ListNode head) {
        ListNode node1 = head;
        ListNode node2 = head;

        while(node2 != null &&  node2.next!= null){
            node1 = node1.next;
            node2 = node2.next.next;

            if(node1 == node2){
                return true;
            }
        }

        return false;
    }
}

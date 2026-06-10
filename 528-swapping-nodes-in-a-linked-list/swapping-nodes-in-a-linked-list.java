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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode t1=head, t2=head, t3=head;
        while(k!=1){
            t1=t1.next;
            k--;
        }
        t3=t1;
        while(t3.next!=null){
            t3=t3.next;
            t2=t2.next;
        }
        int t=t1.val;
        t1.val=t2.val;
        t2.val=t;
        return head;
    }
}
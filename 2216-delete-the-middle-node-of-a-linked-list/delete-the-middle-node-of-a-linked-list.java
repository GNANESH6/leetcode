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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return head.next;
        ListNode i=head, j=head,prev=head;
        while(j!=null && j.next!=null){
            prev=i;
            i=i.next;
            j=j.next.next;
        }
        prev.next=i.next;
        return head;
    }
}
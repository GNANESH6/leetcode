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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode T=new ListNode(Integer.MIN_VALUE);
        ListNode slow=head, fast=head.next, pre=T, resHead=T;
        while(slow!=null){
            int fastVal=(fast==null)?Integer.MIN_VALUE:fast.val;
            if(pre.val!=slow.val && slow.val!=fastVal){
                T.next=slow;
                T=slow;
            }
            pre=slow;
            slow=fast;
            if(fast!=null) fast=fast.next;
        }
        T.next=null;
        return resHead.next;
    }
}
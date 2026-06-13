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
    public ListNode partition(ListNode head, int x) {
     ListNode small=new ListNode();
     ListNode large=new ListNode();
     ListNode temp=head, t=large;
     head=small;

     while(temp!=null){
        if(temp.val<x){
            small.next=new ListNode(temp.val);
            small=small.next;
        }
        else{
           large.next=new ListNode(temp.val);
           large=large.next;
        }
        temp=temp.next;
     }
     small.next=t.next;
     return head.next;
    }
}
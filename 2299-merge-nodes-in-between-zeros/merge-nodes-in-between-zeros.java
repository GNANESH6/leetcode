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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head, list=head;
        while(temp!=null&&temp.next!=null){
            int sum=0;
            if(temp.val==0){
                while(temp.next!=null&&temp.next.val!=0){
                    sum+=temp.val;
                    temp=temp.next;
                }
                sum+=temp.val;
                temp=temp.next;
                list.next.val=sum;
                list=list.next;
            }
        } 
        list.next=null;
        return head.next;       
    }
}
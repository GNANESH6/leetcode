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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp1=head, temp2=head.next;
        while(temp2!=null){
            int val1=Math.max(temp1.val,temp2.val);
            int val2=Math.min(temp1.val,temp2.val);
            ListNode m=new ListNode(GCD(val1,val2),temp2);
            temp1.next=m;
            temp1=temp2;
            temp2=temp2.next;
        }
        return head;

    }

    static int GCD(int val1,int val2){
        while(val2!=0){
            int r=val1%val2;
            val1=val2;
            val2=r;
        }
        return val1;
    }
}
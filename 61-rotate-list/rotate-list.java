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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null || head.next==null) return head;
        ListNode temp1=head, temp2=head;
        int cnt=1;
        while(temp1.next!=null){
            cnt++;
            temp1=temp1.next;
        }
        k=k%cnt;
        if(k==0) return head;
        cnt=cnt-k;
        while(cnt>1){
            temp2=temp2.next;
            cnt--;
        }
        ListNode head2=temp2.next;
        temp2.next=null;
        temp1.next=head;
        return head2;
    }
}
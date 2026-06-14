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
    public int pairSum(ListNode head) {
        ListNode slow=head, fast=head.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=slow.next;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=slow;
            slow=temp;
            temp=next;
        }
        int max=Integer.MIN_VALUE;
        while(fast.next!=head || head.next!=fast){
            max=Math.max(max,head.val+fast.val);
            fast=fast.next;
            head=head.next;
        }
        max=Math.max(max,head.val+fast.val);
        return max;
    }
}
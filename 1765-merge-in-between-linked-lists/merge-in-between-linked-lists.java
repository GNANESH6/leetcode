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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode t1=list1, t2=list1, t3=list2;
        int cnt=0;
        while(t3.next!=null) t3=t3.next;
        while(cnt<b){
            if(cnt<a-1) t1=t1.next;
            t2=t2.next;
            cnt++;
        }
        t1.next=list2;
        t3.next=t2.next;
        return list1;        
    }
}
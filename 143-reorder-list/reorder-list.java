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
    public void reorderList(ListNode head) {
        ArrayList<Integer> al=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        int l=0, r=al.size()-1;
        temp=head;
        while(l<=r){
            temp.val=al.get(l++);
            temp=temp.next;
            if(temp!=null && l<=r){
             temp.val=al.get(r--);
             temp=temp.next;
            }
        }
    }
}
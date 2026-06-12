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

 import java.math.BigInteger;

class Solution {
    public ListNode doubleIt(ListNode head) {
        StringBuilder sb=new StringBuilder();
        while(head!=null) {
            sb.append(head.val);
            head=head.next;
        }

        BigInteger n=new BigInteger(sb.toString());
        n=n.multiply(BigInteger.valueOf(2));
        String st=n.toString();

        ListNode list=new ListNode();
        ListNode temp=list;
        for(char ch:st.toCharArray()){
            temp.next=new ListNode(ch-'0',null);
            temp=temp.next;
        } 
        return list.next;   
    }
}
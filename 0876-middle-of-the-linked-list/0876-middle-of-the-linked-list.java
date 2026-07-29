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
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null) return head;
        int n=0;

        ListNode temp = head;

        while(temp != null){
            n++;
            temp=temp.next;
        }
        int count = n/2 +1;
        temp=head;

        while(temp != null){
            count--;

            if(count==0){
                return temp;
            }
            temp=temp.next;
            

            

        }
        return null;
        
    }
}
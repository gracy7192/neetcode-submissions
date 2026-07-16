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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode curr=list1,curr2=list2;
        ListNode dum = new ListNode(-1);
        ListNode dummy=dum;
        while(curr!=null && curr2!=null){
          if(curr.val>curr2.val){
            dummy.next=curr2;
            curr2=curr2.next;
          }else{
            dummy.next=curr;
            curr=curr.next;
          }
          dummy=dummy.next;
        }

        while(curr!=null){
         dummy.next=curr;
         curr=curr.next;
            dummy=dummy.next;
        }
         while(curr2!=null){

 dummy.next=curr2;
 curr2=curr2.next;
  dummy=dummy.next;
        }
        return dum.next;
    }
}
package Linked_List;

public class ListNode2 {
     int val;
     ListNode2 next;
     ListNode2() {}
     ListNode2(int val) { this.val = val; }
     ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
 }
 class Solution {
    public ListNode2 reverseList(ListNode2 head) {
        ListNode2 prev=null;
        ListNode2 temp=head;
        while(temp!=null){
            ListNode2 front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}
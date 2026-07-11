package Linked_List;
/*
19. Remove Nth Node From End of List
Given the head of a linked list, remove the nth node from the end of the list and return its head.
*/
public class ListNode6 {
     int val;
    ListNode6 next;
     ListNode6() {}
     ListNode6(int val) { this.val = val; }
     ListNode6(int val, ListNode6 next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode6 removeNthFromEnd(ListNode6 head, int n) {
        ListNode6 dummy=new ListNode6(0);
        dummy.next=head;
        ListNode6 slow=dummy;
        ListNode6 fast=dummy;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}
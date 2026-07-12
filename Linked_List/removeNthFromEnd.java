package Linked_List;
/*
19. Remove Nth Node From End of List
Given the head of a linked list, remove the nth node from the end of the list and return its head.
*/
public class removeNthFromEnd {
     int val;
    removeNthFromEnd next;
     removeNthFromEnd() {}
     removeNthFromEnd(int val) { this.val = val; }
     removeNthFromEnd(int val, removeNthFromEnd next) { this.val = val; this.next = next; }
 }

class Solution5 {
    public removeNthFromEnd removeNthFromEnd(removeNthFromEnd head, int n) {
        removeNthFromEnd dummy=new removeNthFromEnd(0);
        dummy.next=head;
        removeNthFromEnd slow=dummy;
        removeNthFromEnd fast=dummy;
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
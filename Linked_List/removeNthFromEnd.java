package Linked_List;
/*
19. Remove Nth Node From End of List
Given the head of a linked list, remove the nth node from the end of the list and return its head.
*/
class ListNodeB {
     int val;
    ListNodeB next;
     ListNodeB() {}
     ListNodeB(int val) { this.val = val; }
     ListNodeB(int val, ListNodeB next) { this.val = val; this.next = next; }
 }

class SolutionB {
    public ListNodeB removeNthFromEnd(ListNodeB head, int n) {
        ListNodeB dummy=new ListNodeB(0);
        dummy.next=head;
        ListNodeB slow=dummy;
        ListNodeB fast=dummy;
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
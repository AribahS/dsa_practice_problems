package Linked_List;
/*
19. Remove Nth Node From End of List
Given the head of a linked list, remove the nth node from the end of the list and return its head.
*/
class ListNodeJ {
     int val;
    ListNodeJ next;
     ListNodeJ() {}
     ListNodeJ(int val) { this.val = val; }
     ListNodeJ(int val, ListNodeJ next) { this.val = val; this.next = next; }
 }

class SolutionJ {
    public ListNodeJ removeNthFromEnd(ListNodeJ head, int n) {
        ListNodeJ dummy=new ListNodeJ(0);
        dummy.next=head;
        ListNodeJ slow=dummy;
        ListNodeJ fast=dummy;
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
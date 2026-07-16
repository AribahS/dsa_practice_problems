package Linked_List;
/*
25. Reverse Nodes in k-Group
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
k is a positive integer and is less than or equal to the length of the linked list.
If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
You may not alter the values in the list's nodes, only nodes themselves may be changed
*/
class ListNode10{
    int val;
    ListNode10 next;
    ListNode10() {}
    ListNode10(int val) { this.val = val; }
    ListNode10(int val, ListNode10 next) { this.val = val; this.next = next; }
}
public class reverseKGroup {
 public ListNode10 reverseKGroup(ListNode10 head, int k) {
        int cnt=0;
        ListNode10 curr=head;
        while(cnt<k && curr!=null){
            cnt++;
            curr=curr.next;
        }
        if(cnt<k){
            return head;
        }
        ListNode10 current=head;
        ListNode10 prev=null;
        for(int i=0;i<k;i++){
            ListNode10 front=current.next;
            current.next=prev;
            prev=current;
            current=front;
        }
        head.next=reverseKGroup(current,k);
        return prev;
    }   
}

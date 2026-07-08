package Linked_List;
/*
876. Middle of the Linked List

Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

*/
class ListNode1 {
     int val;
     ListNode1 next;
     ListNode1() {}
     ListNode1(int val) { this.val = val; }
     ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode1 middleNode(ListNode1 head) {
        ListNode1 slow=head;
        ListNode1 fast=head;
        while(fast!=null && fast.next!=null && slow!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
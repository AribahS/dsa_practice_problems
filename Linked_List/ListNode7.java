package Linked_List;
/*
148. Sort List
Given the head of a linked list, return the list after sorting it in ascending order.
*/

public class ListNode7 {
      int val;
      ListNode7 next;
      ListNode7() {}
      ListNode7(int val) { this.val = val; }
      ListNode7(int val, ListNode7 next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode7 mergeTwoSortedLinkedList(ListNode7 list1, ListNode7 list2){
        ListNode7 dummy=new ListNode7(-1,null);
        ListNode7 temp=dummy;
        while(list1 !=null && list2 !=null){
            if(list1.val<=list2.val){
                temp.next=list1;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1!=null){
            temp.next=list1;
        }
        else{
            temp.next=list2;
        }
        return dummy.next;
    }
    public ListNode7 findMiddle(ListNode7 head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode7 slow=head;
        ListNode7 fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode7 sortList(ListNode7 head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode7 middle=findMiddle(head);
        ListNode7 right=middle.next;
        middle.next=null;
        ListNode7 left=head;
        left=sortList(left);
        right=sortList(right);
        return mergeTwoSortedLinkedList(left,right);
    }
}
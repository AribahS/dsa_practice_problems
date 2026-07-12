package Linked_List;
/*
148. Sort List
Given the head of a linked list, return the list after sorting it in ascending order.
*/

public class sortList {
      int val;
      sortList next;
      sortList() {}
      sortList(int val) { this.val = val; }
      sortList(int val, sortList next) { this.val = val; this.next = next; }
  }
 
class Solution8 {
    public sortList mergeTwoSortedLinkedList(sortList list1, sortList list2){
        sortList dummy=new sortList(-1,null);
        sortList temp=dummy;
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
    public sortList findMiddle(sortList head){
        if(head==null || head.next==null){
            return head;
        }
        sortList slow=head;
        sortList fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public sortList sortList(sortList head) {
        if(head==null || head.next==null){
            return head;
        }
        sortList middle=findMiddle(head);
        sortList right=middle.next;
        middle.next=null;
        sortList left=head;
        left=sortList(left);
        right=sortList(right);
        return mergeTwoSortedLinkedList(left,right);
    }
}
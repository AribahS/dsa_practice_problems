package Linked_List;
/*
61. Rotate List
Given the head of a linked list, rotate the list to the right by k places.
*/

class ListNodeA {
      int val;
      ListNodeA next;
      ListNodeA() {}
      ListNodeA(int val) { this.val = val; }
      ListNodeA(int val, ListNodeA next) { this.val = val; this.next = next; }
  }
 
class rotateList {
    public ListNodeA rotateRight(ListNodeA head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int length=1;
        ListNodeA tail=head;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }
        tail.next=head;
        k=k%length;
        ListNodeA newTail=head;
        for(int i=1;i<length-k;i++){
            newTail=newTail.next;
        }
        ListNodeA newHead=newTail.next;
        newTail.next=null;
        return newHead;
    }
}
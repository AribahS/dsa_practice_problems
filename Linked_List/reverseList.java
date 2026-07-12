package Linked_List;

public class reverseList {
     int val;
     reverseList next;
     reverseList() {}
     reverseList(int val) { this.val = val; }
     reverseList(int val, reverseList next) { this.val = val; this.next = next; }
 }
 class Solution6 {
    public reverseList reverseList(reverseList head) {
        reverseList prev=null;
        reverseList temp=head;
        while(temp!=null){
            reverseList front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}
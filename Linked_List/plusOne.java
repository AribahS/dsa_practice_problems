package Linked_List;
/*
Add one to a number represented by LL
Given the head of a singly linked list representing a positive integer number.
Each node of the linked list represents a digit of the number, 
with the 1st node containing the leftmost digit of the number and so on. 
The task is to add one to the value represented by the linked list and 
return the head of a linked list containing the final value.
The number will contain no leading zeroes except when the value represented is zero itself.
*/
class Node9 {
    int data;
    Node9 next;
    Node9(int data){
        this.data=data;
        this.next=null;
    }
}
public class plusOne {
    Node9 reverseList(Node9 head){
        Node9 prev=null;
        Node9 curr=head;
        while(curr!=null){
            Node9 front =curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
    Node9 addOne(Node9 head){
        Node9 curr=head;
        int carry=1;
        while(curr!=null && carry>0){
            int sum=curr.data+carry;
            curr.data=sum%10;
            carry=sum/10;
            if(curr.next==null && carry>0){
                curr.next=new Node9(carry);
                carry=0;
            }
            curr=curr.next;
        }
        head=reverseList(head);
        return head;
    }
}

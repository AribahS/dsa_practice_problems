package Linked_List;
/*
Insert node before head in Doubly Linked List
Given the head of a doubly linked list and an integer X, 
insert a node with value X before the head of the linked list and return the head of the modified list.
*/

class Node2 {
    int data;
    Node2 next;
    Node2 prev;
    
    Node2(int data) {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class InsertAtHeadDoubly {
    public static void main(String[] args) {
        Node2 head = new Node2(10);
        head.next = new Node2(20);
        head.next.prev = head;
        head.next.next=new Node2(30);
        head.next.next.prev=head.next;
        System.out.println("Original Doubly Linked List:");
        Node2 current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
        Node2 newNode = new Node2(5);
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        System.out.println("Doubly Linked List after inserting 5 at head:");
        current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
}

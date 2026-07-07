package Linked_List;
/*
Delete head of Doubly Linked List
Given the head of a doubly linked list, 
remove the node at the head of the linked list and return the head of the modified list.
The head is the first node of the linked list.
*/
class Node3 {
    int data;
    Node3 next;
    Node3 prev;
    
    Node3(int data) {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class DeleteHeadDoubly {
    public static void main(String[] args) {
        Node3 head = new Node3(10);
        head.next= new Node3(20);
        head.next.prev=head;
        head.next.next=new Node3(30);
        head.next.next.prev=head.next;
        System.out.println("Original Doubly Linked List:");
        Node3 current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
        head=head.next;
        if(head!=null){
            head.prev=null;
        }
        System.out.println("Doubly Linked List after deleting head:");
        current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }   
}

package Linked_List;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Solution{
    public Node insertAtHead(Node head, int x){
        Node newNode = new Node(x);
        newNode.next=head;
        return newNode;
    }
    public void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class InsertAtHead{
    public static void main(String[] args) {
        Solution obj = new Solution();
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        System.out.println("Orignal Linked List:");
        obj.printList(head);
        head=obj.insertAtHead(head, 5);
        System.out.println("\nLinked List after inserting 5 at head:");
        obj.printList(head);
    }
}
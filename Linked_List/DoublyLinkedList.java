package Linked_List;

class Node1{
    int data;
    Node next;
    Node prev;

    Node1(int data, Node next, Node prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node1 head=new Node1(arr[0],null,null);
        System.out.println(head);
        System.out.println(head.data);
    }
}

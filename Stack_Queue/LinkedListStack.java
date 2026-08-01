package Stack_Queue;
/*
Implement stack using Linkedlist
Implement a Last-In-First-Out (LIFO) stack using a singly linked list. 
The implemented stack should support the following operations: push, pop, top, and isEmpty.
*/

class Node{
    int val;
    Node next;
    Node(int d){
        val=d;
        next=null;
    }
}
class LinkedListStack {
    private Node head;
    private int size;
    public LinkedListStack() {
        head=null;
        size=0;
    }

    public void push(int x) {
       Node element = new Node(x);
       element.next=head;
       head=element;
       size++;
    }

    public int pop() {
      if(head==null){
        return -1;
      }
      int data= head.val;
      Node temp=head;
      head=head.next;
      temp=null;
      size--;
      return data;
    }

    public int top() {
        if(head==null){
            return -1;
        }
        return head.val;
    }

    public boolean isEmpty() {
        return (size==0);
    }
}

package Stack_Queue;
/*
Implement queue using Linkedlist
Implement a First-In-First-Out (FIFO) queue using a singly linked list. 
The implemented queue should support the following operations: push, pop, peek, and isEmpty.
*/

class NodeB{
    int data;
    NodeB next;
    NodeB(int x){
        data=x;
        next=null;
    }
}

class LinkedListQueue {
    private NodeB start;
    private NodeB end;
    private int size;
    public LinkedListQueue() {
        start=end=null;
        size=0;
    }

    public void push(int x) {
       NodeB element=new NodeB(x);
       if(start==null){
        start=end=element;
       }
       else{
        end.next=element;
        end=element;
       }
       size++;
    }

    public int pop() {
      if(start==null){
        return -1;
      }
      int data=start.data;
      NodeB temp=start;
      start=start.next;
      temp=null;
      size--;
      
      return data;
    }

    public int peek() {
        if(start==null){
            return -1;
        }
        return start.data;
    }

    public boolean isEmpty() {
        return (size==0);
    }
}

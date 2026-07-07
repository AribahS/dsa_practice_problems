package Linked_List;
/*
Reverse a Doubly Linked List
Reverse the list in-place and return the new head of the reversed list.
*/
class Node4 {
    int data;
    Node4 next;
    Node4 prev;
    
    Node4(int data) {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class ReverseDLL {
    public Node4 convertArrtoDLL(int arr[]) {
        Node4 head = new Node4(arr[0]);
        Node4 current = head;
        for(int i=1;i<arr.length;i++){
            Node4 newNode = new Node4(arr[i]);
            current.next=newNode;
            newNode.prev=current;
            current=newNode;
            
        }
        return head;
    }
    public Node4 reverseDLL(Node4 head) {
        Node4 current=head;
        Node4 temp=null;
        while(current!=null){
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }
        if(temp!=null){
            head=temp.prev;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        ReverseDLL obj = new ReverseDLL();
        Node4 head=obj.convertArrtoDLL(arr);
        System.out.println("Original Doubly Linked List:");
        Node4 current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
        head=obj.reverseDLL(head);
        System.out.println("Reversed Doubly Linked List:");
        current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
}

package Linked_List;

class Node10{
    int data;
    Node10 next;
    Node10 prev;
    Node10(int d){
        data = d;
        prev = null;
        next = null;
    }
}
public class DeleteKey{
    public Node10 deleteNode(Node10 head, int key){
        Node10 current = head;
        while(current != null){
            Node10 nextNode = current.next;
            if(current.data == key){
                if(current.prev !=null){
                    current.prev.next=current.next;
                } else{
                    head=current.next;
                }
                if(current.next != null){
                    current.next.prev=current.prev;
                }
            }
            current = nextNode;
        }
        return head;
    }
}

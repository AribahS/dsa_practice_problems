package Linked_List;
/*
Remove duplicates from sorted DLL
Given the head of a doubly linked list with its values sorted in non-decreasing order. 
Remove all duplicate occurrences of any value in the list so that only distinct values are present in the list.
Return the head of the modified linked list.
*/
class Node12{
    int data;
    Node12 next;
    Node12 prev;
    Node12(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class RemoveDuplicates{
    public node12 removeDuplicates(Node12 head){
        if(head==null || head.next==null){
            return head;
        }
        Node12 current=head;
        while(current!=null && current.next!=null){
            Node12 nextDistinct=current.next;
            while(nextDistinct!=null && nextDistinct.data==current.data){
                nextDistinct=nextDistinct.next;
            }
            current.next=nextDistinct;
            if(nextDistinct!=null){
                nextDistinct.prev=current;
            }
            current=current.next;
        }
        return head;
    }
}

package Linked_List;
/* 
Find the length of the Linked List
You are given the head of a singly linked list. Your task is to return the number of nodes in the linked list.
 */

class Node13{
    int data;
    Node13 next;
    Node13(int data){
        this.data=data;
        this.next=null;
    }
}
class Solution2 {
    public int countNodes(Node13 head) {
        int count = 0;
        Node13 current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
}

public class CountNodes {
    public static void main(String[] args) {
        Node13 head = new Node13(1);
        head.next = new Node13(2);
        head.next.next = new Node13(3);
        Solution2 obj = new Solution2();
        int length = obj.countNodes(head);
        System.out.println("Length of the linked list: " + length);
    }
}


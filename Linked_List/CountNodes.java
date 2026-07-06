package Linked_List;
/* 
Find the length of the Linked List
You are given the head of a singly linked list. Your task is to return the number of nodes in the linked list.
 */

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Solution2 {
    public int countNodes(Node head) {
        int count = 0;
        Node current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
}

public class CountNodes {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        Solution2 obj = new Solution2();
        int length = obj.countNodes(head);
        System.out.println("Length of the linked list: " + length);
    }
}


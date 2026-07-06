package Linked_List;
/*
Search in Linked List
You are given the head of a singly linked list and an integer key.
Return true if the key exists in the linked list, otherwise return false.
*/


class ListNode {
    int val;
    ListNode next;

    ListNode(int value) {
        this.val = value;
        this.next = null;
    }
}

class Solution3 {
    public boolean searchKey(ListNode head, int key) {
       ListNode current=head;
       while(current != null){
        if(current.val==key){
            return true;
        }
        current=current.next;
       }
       return false;
    }
}
public class SearchLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        Solution3 obj = new Solution3();
        int key = 20;
        boolean found = obj.searchKey(head,key);
        if(found){
            System.out.println("Key " + key + " found in the linked list.");
        } else {
            System.out.println("Key " + key + " not found in the linked list.");
        }
    }
}

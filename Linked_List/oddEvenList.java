package Linked_List;
/*
328. Odd Even Linked List
Given the head of a singly linked list, 
group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
The first node is considered odd, and the second node is even, and so on.
Note that the relative order inside both the even and odd groups should remain as it was in the input.
You must solve the problem in O(1) extra space complexity and O(n) time complexity.
*/

class NodeA {
     int val;
     NodeA next;
     NodeA() {}
     NodeA(int val) { this.val = val; }
     NodeA(int val, NodeA next) { this.val = val; this.next = next; }
}
class oddEvenList {
    public NodeA oddEvenList(NodeA head) {

        if (head == null || head.next == null)
            return head;

        NodeA odd = head;
        NodeA even = head.next;
        NodeA evenHead = even;

        while (even != null && even.next != null) {

            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}
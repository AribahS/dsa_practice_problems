package Linked_List;
/*
328. Odd Even Linked List
Given the head of a singly linked list, 
group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
The first node is considered odd, and the second node is even, and so on.
Note that the relative order inside both the even and odd groups should remain as it was in the input.
You must solve the problem in O(1) extra space complexity and O(n) time complexity.
*/

public class ListNode4 {
     int val;
     ListNode4 next;
     ListNode4() {}
     ListNode4(int val) { this.val = val; }
     ListNode4(int val, ListNode4 next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode4 oddEvenList(ListNode4 head) {

        if (head == null || head.next == null)
            return head;

        ListNode4 odd = head;
        ListNode4 even = head.next;
        ListNode4 evenHead = even;

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
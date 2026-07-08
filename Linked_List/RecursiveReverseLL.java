package Linked_List;

import java.util.*;
class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int x) { val = x; next = null; }
}

class Solution4 {
    // Recursive method to reverse linked list
    public ListNode3 reverseList(ListNode3 head) {
        // Base case: if list is empty or has only one node
        if (head == null || head.next == null)
            return head;

        // Recursively reverse the rest of the list
        ListNode3 newHead = reverseList(head.next);

        // Store reference to next node
        ListNode3 front = head.next;

        // Make the next node point to current node
        front.next = head;

        // Break original forward link
        head.next = null;

        // Return new head of reversed list
        return newHead;
    }
}

// Driver code
class RecursiveReverseLL {
    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode3 head = new ListNode3(1);
        head.next = new ListNode3(2);
        head.next.next = new ListNode3(3);
        head.next.next.next = new ListNode3(4);
        head.next.next.next.next = new ListNode3(5);

        Solution4 sol = new Solution4();
        ListNode3 reversed = sol.reverseList(head);

        // Printing reversed list
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }
        System.out.println();
    }
}
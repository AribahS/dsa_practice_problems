package Linked_List;

class Node5{
    int data;
    Node5 next;
    Node5(int d){
        data = d;
        next = null;
    }
}

class Solution5 {
    // Function to detect loop in linked list
    public int hasLoop(Node5 head) {
        Node5 slow = head;
        Node5 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        
            fast = fast.next.next;     

            if (slow == fast) {        
                return countLoopLength(slow);   
            }
        }                 
        return 0;
    }
    public int countLoopLength(Node5 meetingPoint) {
        Node5 temp = meetingPoint;
        int count = 1;

        while (temp.next != meetingPoint) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class LengthofLoopLL {
    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node5 head = new Node5(1);
        head.next = new Node5(2);
        head.next.next = new Node5(3);
        head.next.next.next = new Node5(4);
        head.next.next.next.next = new Node5(5);

        // Creating a loop for testing: 5 -> 3
        head.next.next.next.next.next = head.next.next; 

        Solution5 sol = new Solution5();
        int loopLength = sol.hasLoop(head);
        if (loopLength > 0) {
            System.out.println("Loop detected in the linked list.");
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
}

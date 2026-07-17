package Linked_List;

class ListNodeB {
    int val;
    ListNodeB next;
    ListNodeB(int val) {
        this.val = val;
        this.next = null;
    }
}

public class deleteNode {
    public void deleteNode(ListNodeB node) {
       node.val=node.next.val;
       node.next=node.next.next;
    }
}

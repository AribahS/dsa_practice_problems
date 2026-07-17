package Linked_List;

 class NodeC{
     int val;
     NodeC next;
      NodeC() {}
      NodeC(int val) { this.val = val; }
     NodeC(int val, NodeC next) { this.val = val; this.next = next; }
 }
class isPalindrome {
    public NodeC reverse(NodeC head){
        NodeC prev=null;
        NodeC curr=head;
        while(curr!=null){
            NodeC front = curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
    public boolean isPalindrome(NodeC head) {
        if(head==null || head.next==null){
            return true;
        }
        NodeC slow=head;
        NodeC fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        NodeC secondHalf=reverse(slow.next);

        NodeC first=head;
        NodeC second=secondHalf;
        while(second!=null){
            if(first.val!=second.val){
                slow.next=reverse(secondHalf);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        slow.next=reverse(secondHalf);
        return true;
    }
}
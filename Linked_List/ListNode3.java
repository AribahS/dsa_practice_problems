package Linked_List;

 public class ListNode3 {
     int val;
     ListNode3 next;
      ListNode3() {}
      ListNode3(int val) { this.val = val; }
     ListNode3(int val, ListNode3 next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode3 reverse(ListNode3 head){
        ListNode3 prev=null;
        ListNode3 curr=head;
        while(curr!=null){
            ListNode3 front = curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode3 head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode3 slow=head;
        ListNode3 fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode3 secondHalf=reverse(slow.next);

        ListNode3 first=head;
        ListNode3 second=secondHalf;
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
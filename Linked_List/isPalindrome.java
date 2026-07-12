package Linked_List;

 public class isPalindrome {
     int val;
     isPalindrome next;
      isPalindrome() {}
      isPalindrome(int val) { this.val = val; }
     isPalindrome(int val, isPalindrome next) { this.val = val; this.next = next; }
 }
class Solution3 {
    public isPalindrome reverse(isPalindrome head){
        isPalindrome prev=null;
        isPalindrome curr=head;
        while(curr!=null){
            isPalindrome front = curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
    public boolean isPalindrome(isPalindrome head) {
        if(head==null || head.next==null){
            return true;
        }
        isPalindrome slow=head;
        isPalindrome fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        isPalindrome secondHalf=reverse(slow.next);

        isPalindrome first=head;
        isPalindrome second=secondHalf;
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
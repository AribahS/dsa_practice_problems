package Linked_List;


public class ListNode9 {
     int val;
     ListNode9 next;
     ListNode9() {}
     ListNode9(int val) { this.val = val; }
     ListNode9(int val, ListNode9 next) { this.val = val; this.next = next; }
 }

class addTwoLL {
    public ListNode9 addTwoNumbers(ListNode9 l1, ListNode9 l2) {
       ListNode9 dummy=new ListNode9();
       ListNode9 temp=dummy;
       int carry=0;
       while(l1!=null || l2!=null || carry!=0){
        int sum=0;
        if(l1!=null){
            sum+=l1.val;
            l1=l1.next;
        }
        if(l2!=null){
            sum+=l2.val;
            l2=l2.next;
        }
        sum+=carry;
        carry=sum/10;
        ListNode9 node =new ListNode9(sum%10);
        temp.next=node;
        temp=temp.next;
       } 
       return dummy.next;
    }
}
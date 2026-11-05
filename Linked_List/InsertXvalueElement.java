package Linked_List;
class ListNode6{
    public int data;
    public ListNode6 next;
    ListNode6() { data = 0; next = null; }
    ListNode6(int x) { data = x; next = null; }
    ListNode6(int x, ListNode6 next) { data = x; this.next = next; }
}
public class InsertXvalueElement {
    public ListNode6 insertBeforeX(ListNode6 head, int X, int val) {
       ListNode6 dummy=new ListNode6(val);
       if(head==null) return dummy;
       if(head.data==X){
        dummy.next=head;
        return dummy;
       }
       ListNode6 prev=head;
       ListNode6 curr=head.next;
       while(curr!=null){
        if(curr.data==X){
           dummy.next=curr;
           prev.next=dummy;
           return head;
        }
        prev=curr;
        curr=curr.next;
    }
       return head;
    }
}

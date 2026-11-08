package Linked_List;
class ListNode8{
    public int data;
    public ListNode8 next;
    ListNode8() { data = 0; next = null; }
    ListNode8(int x) { data = x; next = null; }
    ListNode8(int x, ListNode8 next) { data = x; this.next = next; }
}
public class InsertKthElement {
    public ListNode8 insertAtKthPosition(ListNode8 head, int X, int K) {
        ListNode8 dummy=new ListNode8(X);
        if(head==null){
            head=dummy;
            return head;
        }
        if(K==1){
            dummy.next=head;
            head=dummy;
            return head;
        }
        ListNode8 prev=head;
        int count=1;
        while(prev!=null && count<K-1){
            prev=prev.next;
            count++;
        }
        if(prev==null){
            return head;
        }
        dummy.next=prev.next;
        prev.next=dummy;
        return head;
    }
}
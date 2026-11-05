package Linked_List;
class ListNode3{
    public int data;
    public ListNode3 next;
    ListNode3() { data = 0; next = null; }
    ListNode3(int x) { data = x; next = null; }
    ListNode3(int x, ListNode3 next) { data = x; this.next = next; }
}
public class InsertKthElement {
    public ListNode3 insertAtKthPosition(ListNode3 head, int X, int K) {
        ListNode3 dummy=new ListNode3(X);
        if(head==null){
            head=dummy;
            return head;
        }
        if(K==1){
            dummy.next=head;
            head=dummy;
            return head;
        }
        ListNode3 prev=head;
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
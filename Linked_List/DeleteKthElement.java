package Linked_List;
class ListNodeZ{
    public int data;
    public ListNodeZ next;
    ListNodeZ() { data = 0; next = null; }
    ListNodeZ(int x) { data = x; next = null; }
    ListNodeZ(int x, ListNodeZ next) { data = x; this.next = next; }
}
public class DeleteKthElement {
    public ListNodeZ deleteKthNode(ListNodeZ head, int k) {
       if(head==null) return null;
       if(k==1) return head.next;
       ListNodeZ prev=head;
       int count=1;
       while(prev!=null && count<k-1){
        prev=prev.next;
        count++;
       }
       if(prev==null || prev.next==null){
        return head;
       }
       prev.next=prev.next.next;
       return head;
    }
}

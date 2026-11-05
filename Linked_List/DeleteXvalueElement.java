package Linked_List;

class ListNodeG{
    public int data;
    public ListNodeG next;
    ListNodeG() { data = 0; next = null; }
    ListNodeG(int x) { data = x; next = null; }
    ListNodeG(int x, ListNodeG next) { data = x; this.next = next; }
}
public class DeleteXvalueElement {
    public ListNodeG deleteNodeWithValueX(ListNodeG head, int X) {
       if(head==null) return null;
       ListNodeG prev=null;
       ListNodeG curr=head;
       while(curr!=null){
        if(curr.data==X){
            if(prev==null){
                head=curr.next;
            }
            else{
            prev.next=curr.next;
            }
            curr=curr.next;
        }
        else{
        prev=curr;
        curr=curr.next;
        }
    }
       return head;
    }
}

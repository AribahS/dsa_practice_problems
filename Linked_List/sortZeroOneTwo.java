package Linked_List;
/*
Sort a Linked List of 0's 1's and 2's
Given the head of a singly linked list consisting of only 0, 1 or 2.
Sort the given linked list and return the head of the modified list.
Do it in-place by changing the links between the nodes without creating new nodes.
*/
class Node8 {
    int data;
    Node8 next;
    Node8(int data){
        this.data=data;
        this.next=null;
    }
}
class Solution9{
    public Node8 sortZeroOneTwoLL(Node8 head){
        Node8 zerodummy=new Node8(-1);
        Node8 onedummy=new Node8(-1);
        Node8 twodummy=new Node8(-1);

        Node8 zeroTail=zerodummy;
        Node8 oneTail=onedummy;
        Node8 twoTail=twodummy;

        Node8 curr=head;
        while(curr!=null){
            if(curr.data==0){
                zeroTail.next=curr;
                zeroTail=zeroTail.next;
            }
            else if(curr.data==1){
                oneTail.next=curr;
                oneTail=oneTail.next;
            }
            else{
                twoTail.next=curr;
                twoTail=twoTail.next;
            }
            curr=curr.next;
        }
        zeroTail.next=onedummy.next!=null?onedummy.next:twodummy.next;
        oneTail.next=twodummy.next;
        twoTail.next=null;
        return zerodummy.next;
    }
}
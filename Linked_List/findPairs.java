package Linked_List;

import java.util.ArrayList;
import java.util.List;

class Node11{
    int data;
    Node11 next;
    Node11 prev;
    Node11(int d){
        data = d;
        prev=null;
        next = null;
    }
}
public class findPairs {
    public List<List<Integer>> findPairs(Node11 head, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if(head == null) return ans;
        Node11 left = head;
        Node11 right = head;
        while(right.next != null){
            right = right.next;
        }
        while(left != right && left.prev !=right){
            int sum = left.data+right.data;
            if(sum==target){
                List<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                ans.add(pair);
                left=left.next;
                right=right.prev;
            }
            else if(sum<target){
                left=left.next;
            }
            else{
                right=right.prev;
            }
        }
        return ans;
    }
}

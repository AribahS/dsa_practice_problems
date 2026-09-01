package Stack_Queue;
/*
239. Sliding Window Maximum
You are given an array of integers nums, there is a sliding window of size k 
which is moving from the very left of the array to the very right. 
You can only see the k numbers in the window. Each time the sliding window moves right by one position.
Return the max sliding window.
*/
import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
       Deque<Integer> dq=new LinkedList<>();
       int res[]=new int[nums.length-k+1];
       int j=0;
       for(int i=0;i<nums.length;i++){
        if(!dq.isEmpty() && dq.peekFirst()<=i-k){
            dq.pollFirst();
        }
        while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
            dq.pollLast();
        }
        dq.offerLast(i);
        if(i>=k-1){
            res[j]=nums[dq.peekFirst()];
            j++;
        }
       } 
       return res;
    }
}

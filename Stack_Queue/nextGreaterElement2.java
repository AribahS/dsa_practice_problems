package Stack_Queue;
/*
503. Next Greater Element II
Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), 
return the next greater number for every element in nums.
The next greater number of a number x is the first greater number to its traversing-order next in the array,
 which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.
*/
import java.util.Stack;

public class nextGreaterElement2 {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[] = new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int ind=i%n;
            int temp=nums[ind];
            while(!st.isEmpty() && st.peek()<=temp){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty()){
                    ans[ind]=-1;
                }
                else{
                    ans[ind]=st.peek();
                }
            }
            st.push(temp);
        }
            return ans;
        }
}

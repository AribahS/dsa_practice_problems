package Stack_Queue;
/*
496. Next Greater Element I
The next greater element of some element x in an array is the first greater element that is to 
the right of x in the same array.
You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and 
determine the next greater element of nums2[j] in nums2. If there is no next greater element,
 then the answer for this query is -1.
Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
*/
import java.util.HashMap;
import java.util.Stack;

public class nextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int n=nums1.length;
       int m=nums2.length;
       int[] ans = new int[n];
       Stack<Integer> st=new Stack<>();
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int num:nums2){
        while(!st.isEmpty() && num>st.peek()){
            map.put(st.pop(),num);
        }
        st.push(num);
       }
       while(!st.isEmpty()){
        map.put(st.pop(),-1);
       }
       for(int i=0;i<n;i++){
        ans[i]=map.get(nums1[i]);
       }
       return ans;
    }
}

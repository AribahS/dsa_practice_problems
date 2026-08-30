package Stack_Queue;

import java.util.Stack;
/*
2104. Sum of Subarray Ranges
You are given an integer array nums. The range of a subarray of nums is the difference 
between the largest and smallest element in the subarray.
Return the sum of all subarray ranges of nums.
A subarray is a contiguous non-empty sequence of elements within an array.
*/
public class SubArrayRanges {
    private int[] findNSE(int arr[]){
        int n=arr.length;
        int nse[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nse[i]=!st.isEmpty()? st.peek():n;
            st.push(i);
        }
        return nse;
    }
    private int[] findPSEE(int arr[]){
        int n=arr.length;
        int psee[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            psee[i]=!st.isEmpty()? st.peek():-1;
            st.push(i);
        }
        return psee;
    }
    private int[] findNGE(int arr[]){
        int n=arr.length;
        int nge[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            nge[i]=!st.isEmpty()? st.peek():n;
            st.push(i);
        }
        return nge;
    }
    private int[] findPGEE(int arr[]){
        int n=arr.length;
        int pgee[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            pgee[i]=!st.isEmpty()? st.peek():-1;
            st.push(i);
        }
        return pgee;
    }
    private long subArrayMins(int[] arr){
        int n=arr.length;
        int[] nse=findNSE(arr);
        int[] psee=findPSEE(arr);
        long sum=0;
        for(int i=0;i<n;i++){
            int left=i-psee[i];
            int right=nse[i]-i;
            long freq=left*right*1L;
            sum+=freq*arr[i];
        }
        return sum;
    }
    private long subArrayMaxs(int[] arr){
        int n=arr.length;
        int[] nge=findNGE(arr);
        int[] pgee=findPGEE(arr);
        long sum=0;
        for(int i=0;i<n;i++){
            int left=i-pgee[i];
            int right=nge[i]-i;
            long freq=left*right*1L;
            sum+=freq*arr[i];
        }
        return sum;
    }
    public long subArrayRanges(int[] nums) {
       return subArrayMaxs(nums)-subArrayMins(nums); 
    }
}
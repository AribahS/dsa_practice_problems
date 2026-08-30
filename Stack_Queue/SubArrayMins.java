package Stack_Queue;
/*
907. Sum of Subarray Minimums
Given an array of integers arr, find the sum of min(b), where b ranges over every (contiguous) subarray of arr. 
Since the answer may be large, return the answer modulo 109 + 7.
*/
import java.util.Stack;

public class SubArrayMins {
    private int[] findNSE(int arr[]){
        int n=arr.length;
        int[] nse=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nse[i]=(!st.isEmpty())? st.peek():n;
            st.push(i);
        }
        return nse;
    }
    private int[] findPSEE(int arr[]){
        int n =arr.length;
        int[] psee=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            psee[i]=(!st.isEmpty())? st.peek():-1;
            st.push(i);
        }
        return psee;
    }
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int nse[]=findNSE(arr);
        int psee[]=findPSEE(arr);
        int mod=(int)1e9+7;
        int sum=0;
        for(int i=0;i<n;i++){
            int left=i-psee[i];
            int right=nse[i]-i;
            long freq=left*right*1L;
            int val=(int)((freq*arr[i])%mod);
            sum=(sum+val)%mod;
        }
        return sum;
    }
}

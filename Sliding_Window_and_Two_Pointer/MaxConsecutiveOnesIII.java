package Sliding_Window_and_Two_Pointer;
/*
1004. Max Consecutive Ones III
Given a binary array nums and an integer k, return the maximum number of 
consecutive 1's in the array if you can flip at most k 0's.
*/
public class MaxConsecutiveOnesIII {
   public int longestOnes(int[] nums, int k) {
       int n=nums.length;
       int left=0;
       int maxLen=0;
       int zeroCount=0;
       for(int right=0;right<n;++right){
            if(nums[right]==0){
                zeroCount++;
            }
            while(zeroCount>k){
                if(nums[left]==0){
                    zeroCount--;
                }
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
       } 
       return maxLen;
    } 
}

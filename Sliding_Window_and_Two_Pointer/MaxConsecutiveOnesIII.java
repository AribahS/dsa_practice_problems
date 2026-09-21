package Sliding_Window_and_Two_Pointer;

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

package Stack_Queue;
/*
42. Trapping Rain Water
Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it can trap after raining.
*/
public class TrappingRainWater {
    public int trap(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int maxLeft=0;
        int maxRight=0;
        int totalWater=0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(height[left]>=maxLeft){
                    maxLeft=height[left];
                } 
                else{
                    totalWater+=maxLeft-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=maxRight){
                    maxRight=height[right];
                } 
                else{
                    totalWater+=maxRight-height[right];
                }
                right--;
            }
        }
        return totalWater;
    }
}

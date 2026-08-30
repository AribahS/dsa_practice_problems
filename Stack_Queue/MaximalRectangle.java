package Stack_Queue;

import java.util.Stack;

/*
85. Maximal Rectangle
Given a rows x cols binary matrix filled with 0's and 1's, find the 
largest rectangle containing only 1's and return its area.
*/
class MaximalRectangle {
    static int largestRectangleArea(int[] heights){
        Stack<Integer> st=new Stack<>();
        int maxArea=0;
        int n=heights.length;
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && (i==n || heights[st.peek()]>=(i<n? heights[i]:0))){
                int height=heights[st.pop()];
                int width;
                if(st.isEmpty()){
                    width=i;
                }
                else{
                    width=i-st.peek()-1;
                }
                maxArea=Math.max(maxArea,height*width);
            }
            st.push(i);
        }
         return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0) return 0;
        int m =matrix[0].length;
        int[] height=new int[m];
        int maxArea=0;
        for(char[] row:matrix){
            for(int i=0;i<m;i++){
                if(row[i]=='1') height[i]++;
                else height[i]=0;
            }
            maxArea=Math.max(maxArea,largestRectangleArea(height));
        }
        return maxArea;
    }
}
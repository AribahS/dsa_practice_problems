package Sliding_Window_and_Two_Pointer;
/*
1423. Maximum Points You Can Obtain from Cards
There are several cards arranged in a row, and each card has an associated number of points. 
The points are given in the integer array cardPoints.
In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
Your score is the sum of the points of the cards you have taken.
Given the integer array cardPoints and the integer k, return the maximum score you can obtain.
*/
public class MaximumPointsCard {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        if(k<0||k>n){
            return -1;
        }
        if(k==0){
            return 0;
        }
        if(k==n){
            int total=0;
            for(int value:cardPoints){
                total+=value;
            }
            return total;
        }
        int currentScore=0;
        for(int i=0;i<k;i++){
            currentScore+=cardPoints[i];
        }
        int maxScore=currentScore;
        int rightIndex=n-1;
        for(int leftIndex=k-1;leftIndex>=0;leftIndex--){
            currentScore-=cardPoints[leftIndex];
            currentScore+=cardPoints[rightIndex];
            rightIndex--;
            if(currentScore>maxScore){
                maxScore=currentScore;
            }
        }
        return maxScore;
    }
}

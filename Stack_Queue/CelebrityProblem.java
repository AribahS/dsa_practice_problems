package Stack_Queue;
/*
Problem Statement: A celebrity is a person who is known by everyone else at the party but does not
know anyone in return. Given a square matrix M of size N x N where M[i][j] is 1 if person i knows 
person j, and 0 otherwise, determine if there is a celebrity at the party. 
Return the index of the celebrity or -1 if no such person exists.
*/
public class CelebrityProblem {
    public int celebrity(int M[][]){
        int n=M.length;
        int top=0;
        int down=n-1;
        while(top<down){
            if(M[top][down]==1){
                top++;
            }
            else if(M[down][top]==1){
                down--;
            }
            else{
                top++;
                down--;
            }
        }
        for(int i=0;i<n;i++){
            if(i==top) continue;
            if(M[top][i]==1 || M[i][top]==0){
                return -1;
            }
        }
        return top;
    }
}

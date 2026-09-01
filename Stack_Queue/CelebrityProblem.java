package Stack_Queue;
import java.util.Stack;
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

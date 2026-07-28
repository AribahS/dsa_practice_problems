package Recursion;
/*
22. Generate Parentheses
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
*/
import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    List<String> ans= new ArrayList<>();
    int n;
    public void solve(String current,int open, int close){
        if(current.length()==2*n){
            ans.add(current);
            return;
        }
        if(open<n){
            solve(current+"(",open+1,close);
        }
        if(close<open){
            solve(current+")",open,close+1);
        }
    }
    public List<String> generateParenthesis(int n) {
       this.n=n;
       solve("",0,0);
       return ans;
    }
}

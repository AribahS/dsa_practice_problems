package Stack_Queue;
/*
32. Longest Valid Parentheses
Given a string containing just the characters '(' and ')', 
return the length of the longest valid (well-formed) parentheses substring.
*/
import java.util.Stack;
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
      Stack<Integer> st=new Stack<>();
      st.push(-1);
      int max=0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            st.push(i);
        }else{
            st.pop();
            if(st.isEmpty()){
                st.push(i);
            } else{
                max=Math.max(max,i-st.peek());
            }
        }
      }
      return max;  
    }
}
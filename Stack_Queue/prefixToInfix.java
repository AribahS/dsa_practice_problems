package Stack_Queue;

import java.util.Stack;

public class prefixToInfix {
    public String prefixToInfix(String s) {
        Stack<String> st=new Stack<>();
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }
            else{
                String op1=st.pop();
                String op2=st.pop();
                st.push("(" + op1 + c + op2 + ")");
            }
        }
        return st.peek();
    }
}

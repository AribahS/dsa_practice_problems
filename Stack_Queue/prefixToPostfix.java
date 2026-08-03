package Stack_Queue;
/*
Prefix to Postfix Conversion
You are given a valid prefix expression consisting of binary operators and single-character operands.
Your task is to convert it into a valid postfix expression.
Prefix (Polish) notation places the operator before operands.
Postfix (Reverse Polish) notation places the operator after operands.
*/
import java.util.Stack;

public class prefixToPostfix {
    public String prefixToPostfix(String s) {
       Stack<String> st= new Stack<>();
       int n = s.length();
       for(int i=n-1;i>=0;i--){
        char c=s.charAt(i);
        if(Character.isLetterOrDigit(c)){
            st.push(String.valueOf(c));
        }
        else{
            String op1=st.pop();
            String op2=st.pop();
            st.push(op1+op2+c);
        }
       }
       return st.peek();
}
 
}

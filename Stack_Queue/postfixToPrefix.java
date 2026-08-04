package Stack_Queue;
/*
Postfix to Prefix Conversion
You are given a valid postfix expression as a string, where:
Operands are single lowercase English letters ('a' to 'z')
Operators are binary: '+', '-', '*', '/'
The expression contains no spaces and is guaranteed to be valid.
*/
import java.util.Stack;

public class postfixToPrefix {
    public String postToPre(String postfix) {
        Stack<String> st= new Stack<>();
        int n=postfix.length();
        for(int i=0;i<n;i++){
            char c= postfix.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }
            else{
                String op1=st.pop();
                String op2=st.pop();
                st.push(c+op1+op2);
            }
        }
        return st.peek();
    }
}

package Stack_Queue;
/*
Prefix to Infix Conversion
You are given a valid arithmetic expression in prefix notation.
Your task is to convert it into a fully parenthesized infix expression.
Prefix notation (also known as Polish notation) places the operator before its operands.
In contrast, infix notation places the operator between operands.
Your goal is to convert the prefix expression into a valid fully parenthesized infix expression.
*/
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

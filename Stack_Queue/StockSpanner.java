package Stack_Queue;
/*
901. Online Stock Span
Design an algorithm that collects daily price quotes for some stock and 
returns the span of that stock's price for the current day.
Implement the StockSpanner class:
StockSpanner() Initializes the object of the class.
int next(int price) Returns the span of the stock's price given that today's price is price.

*/
import java.util.Stack;

public class StockSpanner {
    Stack<int[]> st;
    public StockSpanner() {
       st= new Stack<>(); 
    }
    
    public int next(int price) {
        int span =1;
        while(!st.isEmpty() && st.peek()[0]<=price){
           span+= st.pop()[1];
        }
        st.push(new int[]{price,span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */    

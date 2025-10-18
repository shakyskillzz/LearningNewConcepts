import java.util.*;

public class stack{
    public static void main(String args[]){
        MinStack m = new MinStack();
        m.push(3);
        System.out.println(m.top());
    }
}

class MinStack {
    public Deque<Integer> s;
    public Deque<Integer> mins;

    public MinStack() {
        s = new ArrayDeque<>();
        mins = new ArrayDeque<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(mins.isEmpty() || val <= mins.peek())
            mins.push(val);
        else
            mins.push(mins.peek());
    }
    
    public void pop() {
        s.pop();
        mins.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}
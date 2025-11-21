/* 155. Min Stack
   Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
   Implement the MinStack class:
   MinStack() initializes the stack object.
   void push(int val) pushes the element val onto the stack.
   void pop() removes the element on the top of the stack.
   int top() gets the top element of the stack.
   int getMin() retrieves the minimum element in the stack.
   You must implement a solution with O(1) time complexity for each function.
   -> 1st Attempt TC ~ O(1) , O(N)!
*/

import java.util.Stack;

class MinStack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int val) {
        if(s2.empty() || val<=s2.peek()) s2.push(val);
        s1.push(val);
    }
    
    public void pop() {
        int remove = s1.pop();
        if(!s2.empty() && s2.peek()==remove)
        {
            s2.pop();
        }
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }
}

/* 232. Implement Queue using Stacks
   Implement a first in first out (FIFO) queue using only two stacks. The 
   implemented queue should support all the functions 
   of a normal queue (push, peek, pop, and empty). 
   -> 1st Attempt TC ~ O(N) , SC ~ O(1)!
*/


import java.util.Stack;

class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        if(this.s2.empty())
        {
            s2.push(x);
        }
        else
        {
            while(!s2.empty())
            {
                int value = s2.pop();
                s1.push(value);
            }
            s1.push(x);
            while(!s1.empty())
            {
                int value = s1.pop();
                s2.push(value);
            }
        }
    }
    
    public int pop() {
        return s2.pop();
    }
    
    public int peek() {
        return s2.peek();
    }
    
    public boolean empty() {
        return s2.empty();
    }
}


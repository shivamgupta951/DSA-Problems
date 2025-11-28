/* 225. Implement Stack using Queues
   Implement a last-in-first-out (LIFO) stack using only two queues. 
   The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
   -> 1st Attempt TC ~ O() , SC ~ O()
*/

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
       q1 = new LinkedList<>();
       q2 = new LinkedList<>();
    }
    public void push(int x) {
        if(q1.isEmpty() && q2.isEmpty())
        {
            q1.add(x);
        }
        else if(q1.isEmpty() && !q2.isEmpty())
        {
            q1.add(x);
            while(!q2.isEmpty())
            {
                q1.add(q2.remove());
            }
        }
        else if(q2.isEmpty() && !q1.isEmpty())
        {
            q2.add(x);
            while(!q1.isEmpty())
            {
                q2.add(q1.remove());
            }
        }
    }
    
    public int pop() {
        if(q1.isEmpty() && q2.isEmpty()) return 0;
        else if(q1.isEmpty()) return q2.remove();
        else if(q2.isEmpty()) return q1.remove();
        return 0;
    }
    
    public int top() {
        if(q1.isEmpty() && q2.isEmpty()) return 0;
        else if(q1.isEmpty()) return q2.peek();
        else if(q2.isEmpty()) return q1.peek();
        return 0;

    }
    
    public boolean empty() {
    if(q1.isEmpty() && q2.isEmpty()) return true;
    return false;
    }
}


public class prog60 {
    public static void main(String args[])
    {
        MyStack value = new MyStack();
        value.push(1);
        value.push(2);
        value.push(3);
        value.push(5);
        System.out.println(value.pop());
        System.out.println(value.pop());
        System.out.println(value.pop());
        System.out.println(value.pop());
        System.out.println(value.empty());
    }    
}

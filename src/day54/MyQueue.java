package day54;

import java.util.Stack;

public class MyQueue {
	public Stack<Integer> stack1;
	public Stack<Integer> stack2;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
       stack1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
       int val = peek();
       stack2.pop();
       return val;
    }
    
    /** Get the front element. */
    public int peek() {
    	if(stack2.isEmpty()){
     	   while(!stack1.isEmpty()){
     		   stack2.push(stack1.pop());
     	   }
        }
    	return stack2.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.size() + stack2.size() == 0;
    }
}

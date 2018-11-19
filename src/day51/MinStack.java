package day51;

import java.util.Stack;


public class MinStack {
	 //create 2 stack one normal stack 
	 private Stack<Integer> stackData;
	 //one stack only stores min number in every step see push
	 private Stack<Integer> stackMin;
     
	 public  MinStack() {
    	 this.stackData = new Stack<Integer>();
    	 this.stackMin = new Stack<Integer>();
	 }
	 
	 public  void push(int x) {
	    if(this.stackMin.isEmpty())
	    	this.stackMin.push(x);
	    else if(x <= this.getMin())
	    	this.stackMin.push(x);
	    this.stackData.push(x);
	 }
	    
	 public  void pop() {
		 if(this.stackData.isEmpty()){
			 throw new RuntimeException("Your stack is empty");
		 }
	     if(this.stackData.peek() == this.stackData.peek()){
	    	 this.stackMin.pop();
	     }
	     this.stackData.pop();
	 }
	    
	 public  int top() {
	     return this.stackData.peek();   
	 }
	    
	 public int getMin() {
		 if(this.stackMin.isEmpty())
				throw new RuntimeException("Your stack is empty");
		return stackMin.peek();  
	 }
	
	public void main(String[] args) {

	}
}

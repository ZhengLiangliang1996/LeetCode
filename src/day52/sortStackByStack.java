package day52;

import java.util.Stack;

public class sortStackByStack {
	//from top to bottom : descendant
	public static void sortStackByStack(Stack<Integer> stack) {
		Stack<Integer> help = new Stack<Integer>();
		while(!stack.isEmpty()){
			int cur = stack.pop();
			while(!help.isEmpty() && help.peek() < cur) {
				stack.push(help.pop());
			}
			help.push(cur);
		}
		
		//push help back to the stack
		while(!help.isEmpty()){
			stack.push(help.pop());
		}
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(2);
		stack.push(1);
		stack.push(5);
		stack.push(0);
		sortStackByStack(stack);
		System.out.println(stack.peek());
	}
}	

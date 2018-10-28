package day28;

import java.util.Stack;

public class BaseballGame {
	
	public static int calPoints(String[] ops) {
		Stack<Integer> stack = new Stack();

        for(String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int new1 = top + stack.peek();
                stack.push(top);
                stack.push(new1);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        int ans = 0;
        for(int score : stack) ans += score;
        return ans;
	}
	public static void main(String[] args) {
		String[] test = {"5","2","C","D","+"};
		System.out.println(calPoints(test));
	}
	
	
}

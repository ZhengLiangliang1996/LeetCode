package day1;


import java.util.Stack;


public class ReversePolishNotation {
	public static void main(String[] args) {
		String[] test = {"4", "3", "-"};
		System.out.println(evalRPN(test));
	}
	
	public static int evalRPN(String[] tokens) {
		if(tokens.length == 0){
			return 0;
		}
		
		//找到加减乘除 将逆波兰表达式进行还原
		//遇到符号 进行pop两次进行计算结果并压栈 遇到数字 直接压栈
		Stack<Integer> s = new Stack<Integer>();
		
		for (int i = 0; i < tokens.length; i++) {
			int a = 0;
			int b = 0;
		
			if(tokens[i].equals("+") || tokens[i].equals("-")
			|| tokens[i].equals("*") || tokens[i].equals("/")){
			
				if(tokens[i].equals("+")){
					b = s.pop();
					a = s.pop();
					s.push(a+b);
				}
				if(tokens[i].equals("-")){
					b = s.pop();
					a = s.pop();
					s.push(a-b);
				}
				if(tokens[i].equals("*")){
					b = s.pop();
					a = s.pop();
					s.push(a*b);		
				}
				if(tokens[i].equals("/")){
					b = s.pop();
					a = s.pop();
					s.push(a/b);		
				}
			}else{	//进行压栈
				s.push(Integer.parseInt(tokens[i]));
			}
		}
		return s.pop();
		
	
    }
	
}

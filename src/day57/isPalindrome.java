package day57;

import java.util.Stack;

public class isPalindrome {
	
	public static boolean isPalindrome(ListNode head) {
		Stack<Integer> stack = new Stack<Integer>();
		ListNode tmp = head;
		while(tmp != null){
			stack.push(tmp.val);
			tmp = tmp.next;
		}
		ListNode tmp1 = head;
		while(tmp1 != null){
			if(stack.pop() != tmp1.val){
				return false;
			}
			tmp1 = tmp1.next;
		}
		
		return true;
    }
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		node1.next = new ListNode(2);
		System.out.println(isPalindrome(node1));
	}
}

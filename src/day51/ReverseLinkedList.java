package day51;


public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while(head != null){
        	next = head.next;
        	head.next = pre;
        	pre = head;
        	head = next;
        }
        return pre;
    }
	
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		a.next = new ListNode(2);
		ListNode head = a;
		System.out.println(head.next.val);
	}
}

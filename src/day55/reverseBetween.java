package day55;


public class reverseBetween {
	
	public static ListNode reverseBetween(ListNode head, int m, int n) {
		int len = 0;
		ListNode node1 = head;
		//pre node before m
		ListNode fPre = null;
		//next node after n
		ListNode tPos = null;
		//find fPre and tPos
		while (node1 != null) {
			len++;
			fPre = len == m - 1 ? node1 : fPre;
			tPos = len == n + 1 ? node1 : tPos;
			node1 = node1.next;
		}
		//容错处理
		if (m > n || m < 1 || n > len) {
			return head;
		}
		//记住这里是先不管要换的m和n 先把里面调换，开始的位置是m+1 注意node2有两次next 
		node1 = fPre == null ? head : fPre.next;
		ListNode node2 = node1.next;   //1次
		node1.next = tPos;
		ListNode next = null;
		// Same as the ReverseLinkedListI
		while (node2 != tPos) {
			next = node2.next;         //2次
			node2.next = node1;       
			node1 = node2;
			node2 = next;
		}
		
		if (fPre != null) {
			fPre.next = node1;
			return head;
		}
		return node1;
    }
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		node1.next = new ListNode(2);
		node1.next.next = new ListNode(3);
		node1.next.next.next = new ListNode(4);
		node1.next.next.next.next = new ListNode(5);
		ListNode node = reverseBetween(node1, 2, 4);
		for (int i = 0; i < 5; i++) {
			System.out.println(node.val);
			node = node.next;
		}
	}
}

package day1;


/*public class MinimunDepth {
	public static void main(String[] args) {
		TreeNode tld = new TreeNode(5);
		tld.left = new TreeNode(3);
		//tld.right = new TreeNode(7);
		//tld.left.left = new TreeNode(2);
		//tld.left.right= new TreeNode(4);
		//tld.right.left = new TreeNode(6);
		//tld.right.right= new TreeNode(8);
		System.out.println(run(tld));
	}
	
	public static int run(TreeNode root) {
		if(root == null) return 0;
		
		int left = run(root.left);
		int right= run(root.right);
		
		if(left == 0 || right == 0)
			return 1+right+left;
		
		return left++<right++?left:right;
	}
}
*/
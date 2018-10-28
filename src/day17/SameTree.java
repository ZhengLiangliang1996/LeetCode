package day17;

public class SameTree {
	
	public static boolean isSameTree(TreeNode root1,TreeNode root2){
		if(root1 == null && root2 == null){
			return true;
		}
		if(root1 == null || root2 == null){
			return false;
		}
		if(root1.val != root2.val){
			return false;
		}
		if(root1.val == root2.val){
			return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		a.left = new TreeNode(2);
		a.right = new TreeNode(2);
		a.left.left = new TreeNode(3);
		a.right.right = new TreeNode(3);
		a.left.right = new TreeNode(3);
		a.right.left = new TreeNode(4);
		
		TreeNode b = new TreeNode(1);
		b.left = new TreeNode(2);
		b.right = new TreeNode(2);
		b.left.left = new TreeNode(3);
		b.right.right = new TreeNode(3);
		b.left.right = new TreeNode(3);
		b.right.left = new TreeNode(5);
		
		System.out.println(isSameTree(a, b));
	}
}

package day17;

public class SymmetricTree {
	
	public static boolean isSymmetric(TreeNode root){
		if(root == null){
			return true;
		}
		if(CheckIsMirror(root.left,root.right)){
			return true;
		}
		return false;
	}
	
	private static boolean CheckIsMirror(TreeNode left, TreeNode right) {
		if(left == null && right == null){
			return true;
		}
		//若没经过上面的肯定是有一个不是Null
		if(left == null || right == null){
			return false;
		}
		if(left.val != right.val){
			return false;
		}
		return CheckIsMirror(left.left, right.right) && CheckIsMirror(left.right, right.left);
	}

	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		a.left = new TreeNode(2);
		a.right = new TreeNode(2);
		a.left.left = new TreeNode(3);
		a.right.right = new TreeNode(3);
		a.left.right = new TreeNode(3);
		a.right.left = new TreeNode(4);
		System.out.println(isSymmetric(a));
	}
}

package day17;

public class ReverseBinaryTree {
	
	public static TreeNode invertTree(TreeNode root){
		if(root == null || root.left == null && root.right == null){
			return root;
		}
		TreeNode tempNode = null;
		tempNode = root.left;
		root.left = root.right;
		root.right = tempNode;
		
		invertTree(root.left);
		invertTree(root.right);
		
		return root;
		
	}
	
	public static void main(String[] args) {
		TreeNode a = new TreeNode(4);
		a.left = new TreeNode(2);
		a.right = new TreeNode(7);
		a.left.left = new TreeNode(1);
		a.right.right = new TreeNode(9);
		a.left.right = new TreeNode(3);
		a.right.left = new TreeNode(6);
		
	}
}

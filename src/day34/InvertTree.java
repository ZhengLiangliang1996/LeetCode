package day34;

public class InvertTree {
	
	public static TreeNode invertTree(TreeNode root) {
        if(root == null)
        	return null;
        TreeNode temp = new TreeNode(0);
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invertTree(root.left);
        invertTree(root.right);
        return root;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right= new TreeNode(7);
		root.left.right = new TreeNode(3);
		root.left.left = new TreeNode(1);
		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(9);
		TreeNode root1 = invertTree(root);
		System.out.println(root1.val);
		System.out.println(root1.left.val);
	}
}

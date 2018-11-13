package day43;

public class ConvertBSTtoGreaterTree {
     int sum = 0;
	public  TreeNode convertBST(TreeNode root) {
		//recursive
		if(root == null) return null;
		convertBST(root.right);
		root.val += sum;
		sum = root.val;
		convertBST(root.left);
		return root;
	}
	
	public  void main(String[] args) {
		TreeNode rooTreeNode = new TreeNode(5);
		rooTreeNode.left = new TreeNode(2);
		rooTreeNode.right = new TreeNode(13);
		
		TreeNode a = convertBST(rooTreeNode);
		System.out.println(a.val);
	}
}

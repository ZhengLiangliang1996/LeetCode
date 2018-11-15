package day47;
public class MinimumAbsoluteDifferenceInBST {
	int min = Integer.MAX_VALUE;
	Integer prev = null; //记录上一个结点s
	public int getMinimumDifference(TreeNode root) {
		 //因为是BST，根据性质直接求邻边的最小就可以了
		if(root == null) return min;
		
		getMinimumDifference(root.left);
		
		if(prev != null){
			min = Math.min(min, root.val - prev);
		}
		
		prev = root.val;
		
		getMinimumDifference(root.right);
		
		return min;
	}
	
	public void main(String[] args) {
		TreeNode rooTreeNode = new TreeNode(5);
		rooTreeNode.left = new TreeNode(2);
		rooTreeNode.right = new TreeNode(13);
		System.out.println(getMinimumDifference(rooTreeNode));
	}
}

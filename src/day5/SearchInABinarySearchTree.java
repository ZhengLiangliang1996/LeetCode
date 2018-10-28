package day5;

public class SearchInABinarySearchTree {
	
	public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
        	return null;
        }else if(root.val == val){
        	return root;
        }else if(root.val < val){
        	return searchBST(root.right, val);
        }else{
        	return searchBST(root.left, val);
        }
    }
	
	public static void main(String[] args) {
		TreeNode a = new TreeNode(4);
		a.left = new TreeNode(2);
		a.right = new TreeNode(7);
		a.left.left = new TreeNode(1);
		a.left.right = new TreeNode(3);
		TreeNode b = searchBST(a, 2);
		System.out.println(b.val);
	}
}

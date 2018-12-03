package day63;

public class isBalanceTree {
	
	public static boolean isBalanced(TreeNode root) {
        if(root == null || root.left == null && root.right == null){
        	return true;
        }
        
        boolean[] res = new boolean[1];
        //set it to array beacasue it can be changed as referenced
        res[0] = true;
        getHeight(root, 1, res);
        return res[0];
    }
	// i is level
	private static int getHeight(TreeNode root, int i, boolean[] res) {
		// root is null
		if(root == null){
			return i;
		}
		// start from the left tree
		int lH = getHeight(root.left, i + 1, res);
		if(!res[0]) {
			return i;
		}
		
		int rH = getHeight(root.right, i + 1, res);
		if(!res[0]) {
			return i;
		}
		
		if(Math.abs(lH - rH) > 1){
			res[0] = false;
		}
		//after every recursive return the biggerst one
		return Math.max(lH, rH);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right= new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		System.out.println(isBalanced(root));
	}
}

package day20;

import java.security.Principal;

public class trimBST {
	//values of nodes all lie in [L,R]
    public static TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null){
        	return root;
        }
        
        //当root.val < L时候 左边全部小于L
        if(root.val < L){
        	return trimBST(root.right, L, R);
        }
        // root.val > R 右边都大于R
        else if(root.val > R){
        	return trimBST(root.left, L, R);
        }
        //中间的情况就递归剪枝
        else {
			root.left = trimBST(root.left, L, R);
			root.right= trimBST(root.right, L, R);
			return root;
        }
    }
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(0);
		root.right= new TreeNode(2);
		TreeNode newroot = trimBST(root, 1, 2);
		System.out.println(newroot.val);
		System.out.println(newroot.right.val);
	}
}

package easy;

public class validateBinarySearchTree {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		//root.left.left = new TreeNode(5);
				
		boolean output = ifBinarySearchTree(root);
		System.out.println("Is binary tree?: " +output);
	
	}

	private static boolean ifBinarySearchTree(TreeNode root) {
		
		return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private static boolean validate(TreeNode root, long min, long max) {
		
		if (root == null) return true;
		
		if (root.val <= min || root.val >= max) return false;
		
		return validate(root.left, min, root.val) && validate(root.right, root.val, max);
	
	}
	
	

}

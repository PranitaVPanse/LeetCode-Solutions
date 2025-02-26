package easy;

public class maxDepthBinaryTree {

	public static void main(String[] args) {
		// [3,9,20,null,null,15,7]
		
			TreeNode root = new TreeNode(3);
			root.left = new TreeNode(9);
			root.right = new TreeNode(20);
			root.left.left = new TreeNode(0);
			root.left.right = new TreeNode(0);
			root.right.left = new TreeNode(15);
			root.right.right = new TreeNode(7);
			printTree(root);
			
			int output = maxDepth(root);
			System.out.println("Maximum depth is: " +output);
			
	}

	private static void printTree(TreeNode root) {
		 if (root == null) {
	            return;
	        }
		 
		System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
		
	}

	private static int maxDepth(TreeNode root) {
		
		if(root == null) {
			return 0;
		}
		
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		
		if(leftDepth > rightDepth) {
			return leftDepth + 1;
		}
		
		return rightDepth + 1;
	}

}

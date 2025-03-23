
package easy;

public class diameterOfBinaryTree {

	private static int maxDiameter = 0;

	public static void main(String[] args) {
		// [3,9,20,null,null,15,7]

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		printTree(root);

		int output = diameterOfBinaryTree(root);
		System.out.println("Diameter of Binary Tree is: " +output);

	}

	private static int diameterOfBinaryTree(TreeNode root) {
		dfs(root);

		return maxDiameter;
	}

	private static int dfs(TreeNode root) {
		if(root == null) {
			return 0;
		}

		int leftDepth = dfs(root.left);
		int rightDepth = dfs(root.right);

		maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);

		return 1 + Math.max(leftDepth, rightDepth);
	}


	private static void printTree(TreeNode root) {
		if (root == null) {
			return;
		}

		System.out.print(root.val + " ");
		printTree(root.left);
		printTree(root.right);

	}
}

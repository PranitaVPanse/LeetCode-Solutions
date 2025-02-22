package easy;

public class invertBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(4);	
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
		printTree(root);
		
		TreeNode inverseRoot = invertTree(root);
		
		//print the tree
		
		System.out.println("\n");
		printTree(inverseRoot);
	}
	
	public static void printTree(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        printTree(node.left);
        printTree(node.right);
    }

	public static TreeNode invertTree(TreeNode root) {

		if(root == null) {
			return null;
		}
		
		//Swap the nodes
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		//loop
		invertTree(root.left);
		invertTree(root.right);
		
		return root;
	}
}

package easy;

import java.util.LinkedList;
import java.util.Queue;

public class convertSortedArrayToBST {

	public static void main(String[] args) {

		int[] nums = {-10, -3, 0, 5, 9};
		TreeNode root = sortedArrayToBST(nums);
		
		//print the tree
		System.out.println("\n");
		printTree(root);
	}
	
	public static void printTree(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        printTree(node.left);
        printTree(node.right);
    }

	private static TreeNode sortedArrayToBST(int[] nums) {
		TreeNode output = helper(nums, 0, nums.length -1);

		return output;
	}

	private static TreeNode helper(int[] nums, int left, int right) {
		if(left > right) {
			return null;
		}

		int mid = left + (right - left)/2;
		TreeNode root = new TreeNode(nums[mid]);

		root.left = helper(nums, left, mid -1);
		root.right = helper(nums, mid+1, right);

		return root;
	}
}
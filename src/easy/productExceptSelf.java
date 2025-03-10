package easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class productExceptSelf {

	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 4};
		
		int[] output = prefixSuffix(nums);
		int[] output1 = prodExceptSelfWithdivision(nums);
		int[] output2 = solHighTimeComplexity(nums);
		System.out.println("Product Except Self using division: " +Arrays.toString(output1));
		System.out.println("Product Except Self using O(n^2) time complexity: " +Arrays.toString(output2));
		System.out.println("Product Except Self using prefix and suffix approach: " +Arrays.toString(output));

	}

		//Optimal solution with time complexity O(n) and without using division
	private static int[] prefixSuffix(int[] nums) {
		
		int n = nums.length;
        int[] output = new int[n];

        // Step 1: Compute prefix product
        output[0] = 1; 									// First element has no prefix
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        // Step 2: Compute suffix product on the fly and multiply with prefix
        int suffix = 1; 								// Initially, no elements after the last one
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= suffix; 						// Multiply with suffix product
            suffix *= nums[i];   						// Update suffix product
        }

        return output;
	}


	private static int[] solHighTimeComplexity(int[] nums) {
		
		ArrayList<Integer> tempOutput = new ArrayList();
		
		int product = 1;
		
		
		for(int i : nums) {
			product *= i;
		}
		
		int exceptSelf = product;
		int count = 0;
		int finalOutput = 0;
		
		for(int j : nums) {
			exceptSelf = product;
			count = 0;
			
		if(j != 0) {	
			while(exceptSelf >= j) {
				exceptSelf -= j;
				count++;
			}
		} 
			finalOutput = product - ((j-1) * count);
			//System.out.println("Final Product: " +finalOutput);
			
			tempOutput.add(finalOutput);
		}
		
		int[] output = tempOutput.stream().mapToInt(Integer::intValue).toArray();

		
		return output;
	}
	
	
	

	private static int[] prodExceptSelfWithdivision(int[] nums) {

		int[] output = new int[nums.length]; 
		int product= 1;
			
		for(int i : nums) {
				product *= i;
			}
			
		for(int j=0; j<output.length; j++) {
			
			if(nums[j] == 0){
				output[j] = 0;
			} else {
			output[j] = product / nums[j];
			}
		}
			
		return output;
	}

}

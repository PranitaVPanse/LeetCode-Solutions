package easy;

import java.util.Arrays;

public class maxSubarray {

	public static void main(String[] args) {
		//int [] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; 		//expected output = 6
		int[] nums =  {-4, -2, -5, -1, -7};

		int output = maxSubarray(nums);
		System.out.println("Max sum of subarray is: " +output);
	}

	//Solved using Kadane’s Algorithm
	
	private static int maxSubarray(int[] nums) {

		int maxSum = nums[0];
		int currSum = 0;

		int start =0;
		int end = 0;
		int tempStart = 0;
																					
		for(int i=0; i<nums.length; i++) {				
			if(currSum + nums[i] > nums[i]) {			
				currSum = currSum + nums[i];		
			} else {
				currSum = nums[i];
				tempStart = i;
			}

			if(currSum > maxSum) {			
				maxSum = currSum;
				start = tempStart;	
				end = i;
			}

			if(currSum == nums[i]) {
				tempStart = i;	
			}
		}

		int[] subArray = Arrays.copyOfRange(nums, start, end + 1);

		System.out.println("Subarray is: " + Arrays.toString(subArray));

		return maxSum;
	}

}

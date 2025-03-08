package easy;

import java.util.ArrayList;

public class climbingStairs {

	public static void main(String[] args) {
		int n = 11;
		int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		ArrayList<Integer> output = climbStaris(nums);
		System.out.println("Number od ways to climb " +n + " steps is: " +output);

	}

	//This problem statement follows fibonacci series - 1 1 2 3 5 8 and so on
	// added this method with an array to showcase the fibonacci series. 
	private static ArrayList<Integer> climbStaris(int[] nums) {

		ArrayList<Integer> output = new ArrayList<>();			//added for array output
		
		for(int j=0; j<nums.length; j++) { 						//added for array output
			
			int n = nums[j];									//added for array output
			
			if (n == 0) {										//added for array output
                output.add(1);
                continue;
            }
			
			int[] steps = new int[n + 1];
	            steps[0] = 1;
	            steps[1] = 1;
			
			
			for(int i=2; i<=n; i++) {
				steps[i] = steps[i-1] + steps[i-2];			
			}
			
			output.add(steps[n]);								//added for array output
		}	
		return output;
	}

}

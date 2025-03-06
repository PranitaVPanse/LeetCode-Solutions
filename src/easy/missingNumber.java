package easy;

import java.util.Arrays;

public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] nums = {2, 0, 1};
			
			int output = missingNumber(nums);
			System.out.println("Missing number is: " +output);
	}

	private static int missingNumber(int[] nums) {

		Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        
        	//With O(n) time complexity
        /*int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }*/
		
		return nums.length;
	}

}

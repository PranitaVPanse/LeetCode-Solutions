package easy;

import java.util.Arrays;

public class singleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums = {1, 2, 1, 3, 2};
			
			int output = singleNumber(nums);
			System.out.println(output);
			
	}
	
	public static int singleNumber(int[] nums) {
        int output = 0;
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(i != nums.length-1){
                if(nums[i] != nums[i+1]){
                    output = nums[i];
                } else{
                    i = i+1;
                }
            } else {
                output = nums[i];
            }
        }
        
        /* Or using XOR for O(n) time complexity
          int result = 0;
    	  for (int num : nums) {
       		result ^= num;
    	  }
    		return result;
       */
        return output;
    }

}

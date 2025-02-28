package easy;

public class majorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] nums = {3, 2, 3, 3, 2, 3};
		int [] nums = {3, 2, 3, 2, 2, 4};
		
		int output = majorityElement(nums);
		System.out.println("Majority Element is:" +output);
		
	}
		
		// Boyer-Moore Voting Algorithm 
	private static int majorityElement(int[] nums) {
			int output = 0;
			int count = 0;
			
			for(int num : nums) {
				if(count == 0) {
					output = num;
				}
				
				if(num == output) {
					count += 1;
				} else {
					count += -1;
				}
			}
		return output;
	}

}

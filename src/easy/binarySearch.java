package easy;

public class binarySearch {

	public static void main(String[] args) {
		int [] input = {1,4,5,6,7};
		int target = 8;
		
		int output = search(input, target);
		
		if(output != -1) {
			System.out.println("Target is found on position: " +output);
		} else {
			System.out.println("Target not found");
		}
	}

	private static int search(int[] input, int target) {
		int low = 0;
		int high = input.length -1;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(input[mid] == target) {
				return mid;
			} else {
				if(input[mid] > target) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
				
			}
		}
		
		
		
		return -1;
	}

}

package easy;

public class numOf1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//int num = 128;
			int num = 2147483645;
			
			int output = hammingWeight(num);
			
			System.out.println("Number of 1 Bits / set bits: " +output);
	}

	private static int hammingWeight(int num) {
		
		String binaryString = Integer.toBinaryString(num);
		
		System.out.println("Binary value: " +binaryString);
		
		char[] charArray = binaryString.toCharArray();
		
		int counter = 0;
		
		for(char ch: charArray) {
			
			//System.out.print(ch + " ");
			
			if(ch == '1') {
				counter = counter + 1;
			}
		}
		System.out.println("counter: " +counter);
		return counter;
	}

}

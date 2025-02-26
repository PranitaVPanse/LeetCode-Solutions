package easy;

public class validPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "A man, a plan, a canal: Panama";		//Expected Output: true
		String s = "0P";				//Expected Output: false
		//String s = "race a car";		//Expected Output: false
		//String s = " ";		//Expected Output: true

		boolean output = isPalindrome(s);
		System.out.println("Output:" +output);
	}

	private static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub

		boolean output = false;
		String inputStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String reverseStr = new String();

		//to reverse the string
		for(int i=inputStr.length()-1; i>=0; i--) {
			reverseStr = reverseStr + inputStr.charAt(i);
		}

		System.out.println("Input string: " +inputStr);
		System.out.println("Reverse string: " +reverseStr);

		//Compare the strings
		if(inputStr.equals(reverseStr)) {
			output = true;
		}

		return output;
	}

}

package easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseString {

	public static void main(String[] args) {


		char s[] = {'h','e','l','l','o'};

		char output[] = reverseString(s);
		System.out.println("Reverse String:" +Arrays.toString(output)); 

	}

	private static char[] reverseString(char[] s) {

		// in-place algorithm swap lst element to first then 2nd last to 2nd and so on. Time complexity is o(n) and space is o(1)
		int left = 0;
		int right = s.length -1;

		while(left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;

			left ++;
			right --;
		}

		return s;
	}

}

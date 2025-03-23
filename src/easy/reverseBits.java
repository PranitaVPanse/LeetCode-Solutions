package easy;

import java.util.ArrayList;

public class reverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0b00000010100101000001111010011100;
		
		int output = reverseBit(n);
		System.out.println("Reverse Bits: " +output);
		
	}

	private static int reverseBit(int n) {

		int result = 0;
		
		for (int i = 0; i < 32; i++) {
            int bit = n & 1;   // Extract the last bit
            result = (result << 1) | bit;  // Shift result left and add the bit
            n >>= 1;  // Shift n right
            
          }
		return result;
	}

}

package easy;

import java.util.Stack;

public class validParentheses {

	public static boolean isValid(String s) {
		
		Stack<Character> stack = new Stack<>();
			
		//Iterate through String s
		for(char c : s.toCharArray()) {
			//Check if c is an open parentheses
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				//check for empty stack
				if(stack.isEmpty()) return false;
				
				char open = stack.pop();
				
				if(c == ')' && open != '(') return false;
				if(c == ']' && open != '[') return false;
				if(c == '}' && open != '{') return false;
			}
		}
		
		return stack.isEmpty();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "([{}])";
			boolean output = isValid(s);
			System.out.println("The parentheses are valid: " +output);
	}

}

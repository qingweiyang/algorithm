package leetcode.string;

import java.util.Stack;

/**
 * 
 * @author yqw
 *Valid Parentheses
 *https://leetcode.com/problems/valid-parentheses/
 *
 *Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 */
public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParentheses v = new ValidParentheses();
		System.out.println(v.isValid("()[]{}("));
	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0 ; i < s.length() ; i++) {
			char c = s.charAt(i);
			if(c == '(' || c == '{' || c== '[') {
				stack.push(c);
			} else {
				if(stack.size() == 0) {
					return false;
				}
				char tmp = stack.pop();
				if(!isMatch(tmp, c)) {
					return false;
				}
			}		
		}
		if(stack.size() > 0)
			return false;
		else
			return true;
    }
	
	private boolean isMatch(char a, char b) {
		if((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'))
			return true;
		else
			return false;
	}
}

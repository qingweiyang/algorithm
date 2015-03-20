package leetcode.string;

import java.util.Stack;

/**
 * 
 * @author yqw
 *Valid Palindrome 
 *https://leetcode.com/problems/valid-palindrome/
 *
 *
 *Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 *For example,
 *"A man, a plan, a canal: Panama" is a palindrome.
 *"race a car" is not a palindrome.
 *
 *Note:
 *Have you consider that the string might be empty? This is a good question to ask during an interview.
 *For the purpose of this problem, we define empty string as valid palindrome.
 *
 */
public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPalindrome v = new ValidPalindrome();
		
		System.out.println(v.isPalindrome("1a2"));
		
	}

	public boolean isPalindrome(String s) {
		Stack<Character> stack = new Stack<Character>();
		String str = s.toLowerCase();
		for(int i = 0 ; i < str.length() ; i++) {
			char tmp = str.charAt(i);
			if(isChar(tmp)) 
				stack.push(tmp);
		}
		
		for(int i = 0 ; i < str.length() ; i++) {
			char tmp = str.charAt(i);
			if(isChar(tmp) && stack.pop() != tmp) {
				return false;
			}
		}
		return true;
    }
	
	private boolean isChar(char c) {
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
			return true;
		else
			return false;
	}
}

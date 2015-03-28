package leetcode.string;

/**
 * 
 * @author yqw
 *String to Integer (atoi) 
 *https://leetcode.com/problems/string-to-integer-atoi/
 *
 *Implement atoi to convert a string to an integer.
 *
 *Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 *Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 *
 */
public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringToInteger s = new StringToInteger();
		
		System.out.println(s.atoi("01"));
		System.out.println(s.atoi("01a1"));
	}

	public int atoi(String str) {
		str = str.trim();
		if(str.length() == 0 || str == null) {
			return 0;
		}
		long res = 0;
		int symbol = 1;
		int index = 0;
		
		if(str.charAt(index) == '+' || str.charAt(index) == '-') {
			symbol = str.charAt(index++) == '+' ? 1 : -1;
		}

		while(index < str.length() && (str.charAt(index) >= '0' && str.charAt(index) <= '9')) {
			int val = str.charAt(index++)-'0';
			res = res*10 + val;
			if(res*symbol > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			if(res*symbol < Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
		}
		return (int) (res*symbol);
    }
}

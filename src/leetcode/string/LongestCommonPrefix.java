package leetcode.string;

/**
 * 
 * @author yqw
 *Longest Common Prefix
 *https://leetcode.com/problems/longest-common-prefix/
 *
 *Write a function to find the longest common prefix string amongst an array of strings.
 *
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommonPrefix l = new LongestCommonPrefix();
		String []str = {"str1","st","b"};
		System.out.println(l.longestCommonPrefix(str));
//		System.out.println(l.commonPrefix("str1", "str2"));
	}

	public String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0)
			return "";
		String res = strs[0];
		for(int i = 1 ; i < strs.length ; i ++) {
			res = commonPrefix(res, strs[i]);
		}
		return res;
	}
	
	private String commonPrefix(String str1, String str2) {
		int len = str1.length() > str2.length() ? str2.length() : str1.length();
		StringBuffer str = new StringBuffer();
		for(int i = 0 ; i < len ; i++) {
			if(str1.charAt(i) == str2.charAt(i)) {
				str.append(str1.charAt(i));
			} else {
				return str.toString();
			}
		}
		return str.toString();
	}
}

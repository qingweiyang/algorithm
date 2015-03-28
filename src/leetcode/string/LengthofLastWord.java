package leetcode.string;

/**
 * 
 * @author yqw
 *Length of Last Word
 *https://leetcode.com/problems/length-of-last-word/
 *
 *Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *If the last word does not exist, return 0.
 *Note: A word is defined as a character sequence consists of non-space characters only.
 *For example,
 *Given s = "Hello World".
 *return 5.
 *
 */
public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LengthofLastWord l = new LengthofLastWord();
		System.out.println(l.lengthOfLastWord_01(""));
	}

	public int lengthOfLastWord(String s) {
		if(s == null || s.equals(" ")) {
			return 0;
		}
		int size = 0;
		int count = 0;
        for(int i = 0 ; i < s.length() ; i++) {
        	if(s.charAt(i) == ' ') {
        		if(i > 0 && s.charAt(i-1) != ' ')
        			size = count;
        		count = 0;
        	} else {
        		count++;
        	}
        }
        return count == 0 ? size : count;
    }
	
	public int lengthOfLastWord_01(String s) {
		if(s == null || s.equals(" ")) {
			return 0;
		}
		int last = s.length()-1;
        while(last >=0 && s.charAt(last) == ' ') {
        	last--;
        }
        int index = last;
        while(last >= 0 && s.charAt(last) != ' ') {
        	last--;
        }
        return index-last;
    }
}

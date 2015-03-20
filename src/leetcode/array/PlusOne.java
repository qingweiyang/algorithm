package leetcode.array;

import util.Print;

/**
 * 
 * @author yqw
 * 
 *Plus One
 *
 *Given a non-negative number represented as an array of digits, plus one to the number.
 *The digits are stored such that the most significant digit is at the head of the list.
 *
 *给你一个用数组表示的数，求加一之后的结果，结果还是用数组表示。
 *
 */
public class PlusOne {

	public static void main(String[] args) {
		PlusOne p = new PlusOne();
		
		int[] A = {9,9,9};
		Print.printArray(p.plusOne(A));
	}

    public int[] plusOne(int[] digits) {
    	int len = digits.length;
    	int tmp = 1; //进位
    	for(int i = len-1 ; i >= 0 ; i--) {
    		int nnum = digits[i]+tmp;
    		digits[i] = nnum%10;
    		tmp = nnum/10;
    		if(tmp == 0) {
    			return digits;
    		}
    	}
    	if(tmp != 0) {
    		int[] newDigits = new int[len+1];
    		System.arraycopy(digits, 0, newDigits, 1, len);
    		newDigits[0] = tmp;
    		return newDigits;
    	} else {
    		return digits;
    	}
    }
    
}

package leetcode.string;

import java.util.HashMap;

/**
 * 
 * @author yqw
 *Roman to Integer 
 *https://leetcode.com/problems/roman-to-integer/
 *
 *Given a roman numeral, convert it to an integer.
 *Input is guaranteed to be within the range from 1 to 3999.
 *
 */
public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        
		return 0;
    }
}

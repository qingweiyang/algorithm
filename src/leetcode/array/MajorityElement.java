package leetcode.array;

import java.util.HashMap;

/**
 * 
 * @author yqw
 *Majority Element
 *https://leetcode.com/problems/majority-element/
 *
 *Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *You may assume that the array is non-empty and the majority element always exist in the array.
 *
 */
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MajorityElement m = new MajorityElement();
		
		int[] a = {1,2,2};
		System.out.println(m.majorityElement(a));
	}
	
	public int majorityElement(int[] num) {
		HashMap<Integer, Integer> tmp = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < num.length ; i++) {
			if(tmp.containsKey(num[i])) {
				tmp.put(num[i], tmp.get(num[i])+1);
			} else {
				tmp.put(num[i], 1);
			}
			if(tmp.get(num[i]) > num.length/2) {
				return num[i];
			}
		} 
		return 0; 
    }

}

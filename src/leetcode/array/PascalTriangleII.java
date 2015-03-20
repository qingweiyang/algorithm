package leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author yqw
 * 
 *Pascal's Triangle II 
 *https://leetcode.com/problems/pascals-triangle-ii/
 *
 *Given an index k, return the kth row of the Pascal's triangle.
 *For example, given k = 3,
 *Return [1,3,3,1].
 *
 *Could you optimize your algorithm to use only O(k) extra space?
 *
 */
public class PascalTriangleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalTriangleII p = new PascalTriangleII();
		p.getRow(3);
		System.out.println(p.getRow(3).get(3));
	}

    public List<Integer> getRow(int rowIndex) {
    	Integer[] res = new Integer[rowIndex+1];
    	
    	for(int i = 1 ; i <= rowIndex+1 ; i++) {
    		for(int j = i-1 ; j >= 0 ; j--) {
    			if(j == 0 || j == i-1) {
    				res[j] = 1;
    			} else {
    				res[j] = res[j]+res[j-1];
    			}
    		}
    	}
    	
    	List<Integer> result = new ArrayList<Integer>();
    	Collections.addAll(result, res);
		return result;
        
    }
    
}

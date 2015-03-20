package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author yqw
 *
 *Pascal's Triangle 
 *
 *Given numRows, generate the first numRows of Pascal's triangle.
 *For example, given numRows = 5,
 *Return
 *
 *[
 *     [1],
 *    [1,1],
 *   [1,2,1],
 *  [1,3,3,1],
 * [1,4,6,4,1]
 *]
 */
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalTriangle p = new PascalTriangle();
		p.generate(5);
	}
	
    public List<List<Integer>> generate(int numRows) {
    	ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
    	ArrayList<Integer> up = new ArrayList<Integer>();
    	
    	for(int i = 1 ; i <= numRows ; i++) {
    		ArrayList<Integer> down = new ArrayList<Integer>();
    		for(int j = 0 ; j < i ; j++) {
    			if(j == 0 || j == i-1) {
    				down.add(1);
    			} else {
    				down.add(up.get(j-1) + up.get(j));
    			}
    		}
    		up = down;
    		res.add(down);
    	}
     
    	return res;
    }

}

package leetcode.array;

import java.util.List;

/**
 * 
 * @author I319213
 *
 *https://leetcode.com/problems/triangle/
 */
public class Triangle {

	/**
	 * minPath[i][j] = min{minPath[i + 1][j], minPath[i + 1][j]} + Triangle[i][j];
	 * 
	 * minPath[i] = min{minPath[i], minPath[i + 1]} + Triangle[i];
	 * @param triangle
	 * @return
	 */
    public int minimumTotal(List<List<Integer>> triangle) {
    	if(triangle == null || triangle.size() < 1) {
    		return 0;
    	}
    	
        for(int i = triangle.size() - 2 ; i >= 0 ; i--) {
        	for(int j = 0 ; j < i + 1 ; j++) {
        		int min = triangle.get(i + 1).get(j) < triangle.get(i + 1).get(j + 1) ? triangle.get(i + 1).get(j) : triangle.get(i + 1).get(j + 1);
        		min = min + triangle.get(i).get(j);
        		triangle.get(i).set(j, min);
        	}
        }
        
        return triangle.get(0).get(0);
    }
}

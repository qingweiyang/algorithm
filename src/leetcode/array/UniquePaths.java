package leetcode.array;

/**
 * 
 * @author I319213
 *
 *https://leetcode.com/problems/unique-paths/
 */
public class UniquePaths {
	
	public int uniquePaths(int m, int n) {
        if(m < 1 || n < 1 ) {
        	return 0;
        }
        
        int tmp[][] = new int[m][n];
        for(int i = 0 ; i < m ; i++) {
        	tmp[i][0] = 1;
        }
        for(int i = 0 ; i < n ; i++) {
        	tmp[0][i] = 1;
        }
        
        for(int i = 1 ; i < m ; i++) {
        	for(int j = 1 ; j < n ; j++) {
        		tmp[i][j] = tmp[i - 1][j] + tmp[i][j - 1];
        	}
        }
        return tmp[m - 1][n - 1];
    }
	
	/**
	 * 递归，时间复杂度高
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
    public int uniquePaths_01(int m, int n) {
        if(m < 1 || n < 1 || (m == 1 && n == 1)) {
        	return 0;
        } else {
        	return next(m - 1, n - 1, 0, 0);
        }
    }
    
    private int next(int m, int n, int i, int j) {
    	if(m == i && n == j) {
    		//发现一条路
    		return 1;
    	}
    	
    	if(i > m || j > n) {
    		//查找失败
    		return 0;
    	}
    	
    	return next(m, n, i, j + 1) + next(m, n, i + 1, j);
    }
}

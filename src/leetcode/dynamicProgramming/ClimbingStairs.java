package leetcode.dynamicProgramming;

/**
 * 
 * @author I319213
 *
 *https://leetcode.com/problems/climbing-stairs/
 *
 *思路很简单， 到第n阶的次数 = 第(n-1)阶的次数 + 第(n-2)阶的次数
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
    	if(n < 2) {
    		return 1;
    	}
    	
    	int oneStep = 1;
    	int twoStep = 0;
    	int tmp = 0;
        for(int i = 0 ; i < n ; i++) {
        	tmp = oneStep;
        	oneStep = oneStep + twoStep;
        	twoStep = tmp;
        }
        
        return oneStep;
    }
}

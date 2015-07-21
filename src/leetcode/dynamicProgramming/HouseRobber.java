package leetcode.dynamicProgramming;

/**
 * 
 * @author yqw
 *House Robber
 *https://leetcode.com/problems/house-robber/
 *
 */
public class HouseRobber {
	
	/**
	 * 动态规划
	 * 
	 * @param nums
	 * @return
	 */
	public int rob(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		
		//上次未偷的最优解
		int notRob = 0;
		for(int i = 1 ; i < nums.length ; i++) {
			nums[i] = nums[i] + notRob;
			//本次未偷，那么偷了上次 没偷和偷了 的最大值
			notRob = Math.max(nums[i - 1], notRob); 
		}
		return Math.max(nums[nums.length - 1], notRob);
    }
	
	/**
	 * 动态规划
	 * 
	 * @param nums
	 * @return
	 */
	public int rob2(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		
		int rob = nums[0];
		int notRob = 0;
		for(int i = 1 ; i < nums.length ; i++) {
			int tmp = notRob;
			//本次未偷，那么偷了上次 没偷和偷了 的最大值
			notRob = Math.max(rob, notRob); 
			rob = nums[i] + tmp;
		}
		return Math.max(rob, notRob);
    }
	
	/**
	 * 递归
	 * 
	 * @param nums
	 * @return
	 */
	public int rob1(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		
        return robbed(nums, nums.length - 1);
    }
	
	public int robbed(int[] nums, int cur) {
		if(cur == 0 || cur == 1) {
			return nums[cur];
		}
		
		int curVal = nums[cur] + robbed(nums, cur-2);
		int noCurVal = robbed(nums, cur-1);
		return curVal > noCurVal ? curVal : noCurVal;
	}
}

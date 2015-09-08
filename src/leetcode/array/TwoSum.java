package leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author I319213
 *
 *https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int res[] = {0, 0};
		for(int i = 0 ; i < nums.length ; i++) {
			if(map.containsKey(target - nums[i])) {
				res[0] = map.get(target - nums[i]);
				res[1] = i + 1;
				return res;
			} else {
				map.put(nums[i], i + 1);
			}
		}
		return res;
	}
	
	/**
	 * 暴力方法
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
    public int[] twoSum_01(int[] nums, int target) {
    	int res[] = new int[2];
        if(nums.length == 0) {
        	return res;
        }
        
        for(int i = 0 ; i < nums.length ; i++) {
        	for(int j = i + 1 ; j < nums.length ; j++) {
        		if(target == nums[i] + nums[j]) {
        			res[0] = i + 1;
        			res[1] = j + 1;
        			return res;
        		}
        	}
        }
        return res;
    }
}

package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/summary-ranges/
 * 
 * @author yqw
 *
 */
public class SummaryRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0, 2, 4, 5, 6};
		List<String> res = new SummaryRanges().summaryRanges(nums);
		
		for(String str : res) {
			System.out.print(str + " ");
		}
	}

	public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        
        if(nums == null || nums.length == 0) {
        	return res;
        }
        
        int begin = 0;
        String tmp = nums[begin] + "";
        int i;
        for(i = 1 ; i < nums.length ;  i++) {
        	if(nums[i] - 1 != nums[i - 1]) {
        		if(i - 1 > begin) {
        			tmp += "->" + nums[i - 1];
        		}
        		res.add(tmp);
        		tmp = nums[i] + "";
        		begin = i;
        	}
        }
        
        //最后一组
        if(i - 1 > begin) {
        	tmp += "->" + nums[i - 1];
        }
        res.add(tmp);
        return res;
    }
}

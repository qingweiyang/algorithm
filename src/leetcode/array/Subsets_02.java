package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subsets_02 s = new Subsets_02();
		List<List<Integer>> res = s.subsetsWithDup(new int[]{1, 2, 2});
		
		for(List<Integer> a : res) {
			for(int b : a) {
				System.out.print(b + ",");
			}
			System.out.println();
		}
	}

	/**
	 * Subsets的元素允许重复
	 * 在遇到重复的元素时，依次为原集合每个元素加上重复的元素，如2，2 则分别加上[2], [2, 2]
	 * 
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        
        Arrays.sort(nums);
        
        for(int i = 0 ; i < nums.length ; i++) {
        	int dupNum = 0;
        	while((i + 1) < nums.length && nums[i + 1] == nums[i]) {
        		dupNum++;
        		i++;
        	}
        	
        	int size = res.size();
        	//再原集合基础上依次给每个元素加i
        	for(int j = 0 ; j < size ; j++) {
        		List<Integer> tmp = new ArrayList<Integer>(res.get(j));
        		//之前逻辑跟subsets一样，不同是当有元素重复时，将重复的依次加上，如1,2,2 则[] -> [],1 -> [1], [2], [2, 2],[1, 2], [1, 2, 2]
        		for(int k = 0 ; k <= dupNum ; k++) {
        			tmp.add(nums[i]);
        			res.add(new ArrayList<Integer>(tmp));
        		}
        	}
        }
        
		return res;
    }
}

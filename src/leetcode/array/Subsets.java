package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/
 * 
 * @author yqw
 *
 */
public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subsets s = new Subsets();
		List<List<Integer>> res = s.subsets(new int[]{1, 2, 3});
		
		for(List<Integer> a : res) {
			for(int b : a) {
				System.out.print(b + ",");
			}
			System.out.println();
		}
	}

	/**
	 * 求数组的子集，
	 * 
	 * 如{1, 2, 3}，做如下操作
	 * {[]} (给前结果集中每个集合加数组下个元素) --> +1
	 * {[], [1]}  --> +2
	 * {[], [1], [2], [1, 2]}  --> +3
	 * {[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]}
	 * 
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res.add(new ArrayList<Integer>());
		
		Arrays.sort(nums);
		for(int i : nums) {
			List<List<Integer>> tmp = new ArrayList<List<Integer>>();
			for(List<Integer> sub : res) {
				List<Integer> a = new ArrayList<Integer>(sub);
				a.add(i);
				tmp.add(a);
			}
			res.addAll(tmp);
		}
		
		return res;
    }
}

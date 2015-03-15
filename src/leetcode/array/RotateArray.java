package leetcode.array;

/**
 * 
 * @author yqw
 * 
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * Note:
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 *
 *https://leetcode.com/problems/rotate-array/
 */
public class RotateArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateArray r = new RotateArray();
		
		int test_01[] = {1,2,3,4,5,6,7};
		int k_01 = 3;
		
//		r.print(test_01);
		r.rotate_02(test_01, k_01);
		r.print(test_01);
	}
	
	public void print(int[] tmp) {
		System.out.print("[");
		for(int i = 0 ; i < tmp.length-1 ; i ++) {
			System.out.print(tmp[i]+", ");
		}
		System.out.print(tmp[tmp.length-1]+"]");
		System.out.println();
	}

	/**
	 * simple way, sacrifice time 
	 * leetcode Time Limit Exceeded
	 * 
	 * @param nums
	 * @param k
	 */
	public void rotate_01(int[] nums, int k) {
        k = k%nums.length;
        int tmp = 0;
        for(int i = k ; i > 0 ; i--) {
            tmp = nums[nums.length - 1];
            for(int j = nums.length - 2 ; j >= 0 ; j--) {
                nums[j+1] = nums[j];
            }
            nums[0] = tmp;
        }
    }
	
	/**
	 * sacrifice space
	 * leetcode Accepted
	 * 
	 * @param nums
	 * @param k
	 */
	public void rotate_02(int[] nums, int k) {
		k = k%nums.length;
		int[] tmp = new int[k];
		for(int i = 0, j = nums.length-k; j < nums.length ; j++, i++) {
			tmp[i] = nums[j];
		}
		
		for(int i = nums.length-k-1, j = nums.length-1; j > k-1; j--, i--) {
			nums[j] = nums[i];
		}
		
		for(int i = 0 ; i < k ; i++) {
			nums[i] = tmp[i];
		}
    }
	
}

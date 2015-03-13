package leetcode;

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
		
	}

	public void rotate(int[] nums, int k) {
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
	
	void go(){
		
	}
	
	int go(int a) {
		return 1;
	}
}

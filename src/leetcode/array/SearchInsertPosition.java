package leetcode.array;

/**
 * https://leetcode.com/problems/search-insert-position/
 * 
 * @author yqw
 *
 */
public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchInsertPosition s = new SearchInsertPosition();
		System.out.println(s.searchInsert_02(new int[]{1, 3, 5, 6}, 2));
	}

	/**
	 * 二分法思想
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int searchInsert_02(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
        	int mid = (low + high) / 2;
        	if(nums[mid] == target) {
        		return mid;
        	} else if(nums[mid] < target) {
        		high = mid - 1;
        	} else {
        		low = mid + 1;
        	}
        }
        //注意返回low，循环结束条件是low>high,此时high错误
        return low;
    }
	
	/**
	 * 从开始遍历到结尾
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        while(index < nums.length && nums[index] < target) index++;
        return index;
    }
}

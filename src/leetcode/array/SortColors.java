package leetcode.array;

/**
 * https://leetcode.com/problems/sort-colors/
 * 
 * @author yqw
 *
 */
public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortColors s = new SortColors();
		int nums[] = {1, 0, 2};
		s.sortColors_02(nums);
		
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print(nums[i] + ",");
		}
	}

	/**
	 * 将所有2放在右边， 0放在左边，剩下的1则就再中间了
	 * 
	 * @param nums
	 */
	public void sortColors_02(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		
		for(int i = 0 ; i <= high ; i++) {
			while(nums[i] == 2 && i < high) swap(nums, i, high--);
			while(nums[i] == 0 && i > low) swap(nums, i, low++);
		}
	}
	
    public void sortColors(int[] nums) {
    	if(nums.length == 0) {
    		return ;
    	}
    	
    	int low = 0;
    	int high = nums.length - 1;
    	while(low < high) {
    		while(low < high && nums[low] == 0) low++;
    		swap(nums, low, high);
    		
    		//先处理高位上为1的数（结果是中间位置的数），保证当前最高位不为1
    		int tmp = high;
    		while(low <= tmp && nums[tmp] == 1) tmp--;
    		if(tmp < low) {
    			//从高向低均为1，表示排序完成
    			return ;
    		} else {
    			swap(nums, tmp, high);
    		}
    		
    		//从高位向低位排序
    		while(low < high && nums[high] == 2) high--;
    		swap(nums, low, high);
    	}
    	
    }
    
    private void swap(int arr[], int a, int b) {
    	int tmp = arr[a];
    	arr[a] = arr[b];
    	arr[b] = tmp;
    }
}

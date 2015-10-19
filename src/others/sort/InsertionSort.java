package others.sort;

import util.Print;

/**
 * 插入排序
 * 
 * @author yqw
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort in = new InsertionSort();
		
//		int a[] = {2, 4, 1};
//		int a[] = {2};
		int a[] = {1, 2, 9, 1, 8};
//		in.straightInsertionSort(a);
		in.shellSort(a);
		
		Print.printArray(a);
	}

	/**
	 * 直接插入排序:
	 * 基本思想：将一个纪录插入到已排好序的列表中，得到新的排好序列表；
	 * 时间复杂度：o(n^2)；
	 * 稳定（两元素大小相同时，不需要改变顺序）；
	 * 
	 * @param arr
	 */
	public void straightInsertionSort(int[] arr) {
		if(arr == null) {
			return ;
		}
		
		for(int i = 1 ; i < arr.length ; i++) {
			for(int j = i ; j > 0 ; j--) {
				if(arr[j] < arr[j - 1]) {
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp; 
				} else {
					break;
				}
			}
		}
		
	}
	
	/**
	 * 希尔排序：
	 * 基本思想：
	 * 不稳定
	 * 
	 * @param arr
	 */
	public void shellSort(int[] arr) {
		if(arr == null) {
			return ;
		}
		
		//定义步长
		for(int i = arr.length/2 ; i > 0 ; i = i/2) {
			//以下是定义了步长的 直接插入排序
			for(int j = i ; j < arr.length ; j += i) {
				for(int k = j ; k > 0 ; k -= i) {
					if(arr[k] < arr[k - i]) {
						int tmp = arr[k];
						arr[k] = arr[k - i];
						arr[k - i] = tmp; 
					} else {
						break;
					}
				}
			}
		}
	}
}

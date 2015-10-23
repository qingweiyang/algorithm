package others.sort;

import util.Print;

/**
 * 交换排序，包含 冒泡排序，快排 两种
 * 
 * @author yqw
 *
 */
public class ExchangeSort {

	public static void main(String[] args) {
		int[] arr = {2, 3, 8, 4, 1};
		ExchangeSort ex = new ExchangeSort();
		ex.bubbleSort(arr);
		Print.printArray(arr);
	}

	/**
	 * 冒泡排序
	 * 
	 * @param arr
	 */
	public void bubbleSort(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr.length - i - 1 ; j++) {
				if(arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
	
}

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
//		ex.bubbleSort(arr);
//		Print.printArray(arr);
		
		ex.quickSort(arr, 0, arr.length - 1);
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
	
	/**
	 * 快排
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 */
	public void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int privotLoc = parition(arr, low, high);
			quickSort(arr, low, privotLoc - 1);
			quickSort(arr, privotLoc + 1, high);
		}
	}
	
	/**
	 * 将arr划分成两个部分，基准数左侧小于基准数，右侧大于它，并返回基准数位置
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	private int parition(int[] arr, int low, int high) {
		int privotKey = arr[low];
		while(low < high) {
			while(low < high && arr[high] >= privotKey) high--;
			swap(arr, low, high);
			
			while(low < high && arr[low] <= privotKey) low++;
			swap(arr, low, high);
		}
		return low;
	}
	
	private void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
}

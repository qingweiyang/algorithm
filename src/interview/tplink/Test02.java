package interview.tplink;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new Test02().findMaxSum(new int[]{2, -8, 3, -2, 4, -10, 6}, 7));
	}

	public int findMaxSum(int[] arr, int len) {
		int max = 0;
		for(int i = 1 ; i < len ; i++) {
			if(arr[i] + arr[i - 1] < 0) {
				arr[i] = arr[i] > 0 ? arr[i] : 0; 
			} else {
				arr[i] = arr[i] + arr[i - 1];
			}
			
			max = arr[i] > max ? arr[i] : max;
		}
		return max;
	}
}

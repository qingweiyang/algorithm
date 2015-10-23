package interview.others;

import java.util.Scanner;

public class Test_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_03 t = new Test_03();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println(t.count(scan.nextInt(), scan.nextInt(), scan.nextInt()));
	}

	/**
	 * 1 4 2
	 * 
	 * @return
	 */
	public int count(int min, int max, int num) {
		int minVal = 1;
		int tmp = 1;
		for(int i = 0 ; i < num - 1; i++) {
			minVal += tmp * 2;
			tmp = tmp*2;
		}
		int maxVal = minVal;
		
		if(minVal < min) {
			minVal = min;
		}
		if(minVal > max) {
			return -1;
		}
		
		while(maxVal <= max) {
			maxVal = maxVal << 1;
		}
		maxVal = maxVal >> 1;
		if(maxVal < min) {
			return -1;
		}
//		System.out.println("min = "+ minVal + " , max=" + maxVal);
		if(minVal > maxVal) {
			return -1;
		} else {
			return maxVal - minVal + 1;
		}
	}
}

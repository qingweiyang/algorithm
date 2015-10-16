package interview.wangyi;

import java.util.Scanner;

/**
 * 1 1 1 2 2 3 3 1 2
 * @author yqw
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strm = str.split(" ");
		int pointNum = (strm.length - 1)/2;
		int point[][] = new int[pointNum][2];
		
		for(int i = 0 ; i < pointNum ; i++) {
			for(int j = 0 ; j < 2 ; j++) {
				point[i][j] = Integer.parseInt(strm[i*2 + j + 1]);
			}
		}
		
		new Main().start(Integer.parseInt(strm[0]), point);
	}

	public void start(int instance, int[][] point) {
		int res =dou(instance);
		int count = 0;
		int last = point.length - 1;
		for(int i = 0 ; i < last ; i++) {
			if(dou(point[last][0] - point[i][0]) + dou(point[last][1] - point[i][1]) <= res) {
				count ++;
			}
		}
		System.out.println(count + "X");
	}
	
	private int dou(int val) {
		return val*val;
	}
}

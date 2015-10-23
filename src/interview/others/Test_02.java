package interview.others;

import java.util.Scanner;

public class Test_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_02 t = new Test_02();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println(t.count(scan.nextInt(), scan.nextInt(), scan.nextInt()));
	}

	/**
	 * 3 13 3
	 * 
	 * @return
	 */
	public int count(int persons, int k, int times) {
		int res = 0;
		int currentVal = 1;
		for(int i = 0, cou = 0 ; i < times * persons ; i++, cou++) {
			if(cou % persons == 0) {
				res += currentVal % k;
			}
			currentVal += i + 1;
		}
		return res;
	}
}

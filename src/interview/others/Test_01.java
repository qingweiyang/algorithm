package interview.others;

import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_01 t = new Test_01();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		for(int i = 0 ; i < num ; i++) {
			char c = scan.nextLine().charAt(0);
			String[] str = scan.nextLine().split(" ");
			System.out.println(t.compare(c, str));
		}
	}

	/**
	 * 1
	 * S
     * 9S 2H
	 * @param c
	 * @param str
	 */
	public int compare(char c, String[] str) {
		char c1 = str[0].charAt(1);
		char c2 = str[1].charAt(1);
		int i1 = getNum(str[0].charAt(0));
		int i2 = getNum(str[1].charAt(0));
		
		if(c1 != c2 && c1 == c) {
			return 1;
		} else if(c1 != c2 && c2 == c){
			return 0;
		} else {
			return i1 > i2 ? 1 : 0;
		}
	}
	
	public int getNum(char c) {
		if(c == 'A' || c =='a') {
			return 1;
		}
		if(c == 'J' || c =='j') {
			return 11;
		}
		if(c == 'Q' || c =='q') {
			return 12;
		}
		if(c == 'K' || c =='k') {
			return 13;
		}
		return c - '0';
	}
}

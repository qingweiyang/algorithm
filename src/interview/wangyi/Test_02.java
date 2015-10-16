package interview.wangyi;

import java.text.DecimalFormat;

/**
 * @!%12dgsa
 * 010111100
 * 
 * 66.67%
 * 
 * @author yqw
 *
 */
public class Test_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_02 t = new Test_02();
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		String str1 = sc.nextLine();
//		String str2 = sc.nextLine();
//		
//		t.start(str1, str2);
		t.start("@!%12dgsa", "010111100");
	}
	
	public void start(String str1, String str2) {
		int len = str1.length();
		int same = 0;
		for(int i = 0 ; i < len ; i++) {
			char tmp = str1.charAt(i);
			if((tmp >= '0' && tmp <= '9') ||
					(tmp >= 'a' && tmp <= 'z') || 
					(tmp >= 'A' && tmp <= 'Z') ) {
				if(str2.charAt(i) == '1') {
					same ++;
				}
			} else {
				if(str2.charAt(i) == '0') {
					same ++;
				}
			}		
		}
		
		DecimalFormat df = new DecimalFormat("0.00");
		double d = (double)same/len * 100; 
		
		System.out.println(df.format(d) + "%");
	}

}

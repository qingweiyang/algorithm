package interview.tplink;

public class Test03 {
	public static void main(String []args){
		System.out.println(new Test03().strnstr("asdasd", "sd", 2));
	}
	
	/**
	 * 返回index位置，未找到返回－1
	 * 
	 * @param str1
	 * @param str2
	 * @param n
	 * @return
	 */
	public int strnstr(String str1, String str2, int n) {
		
		for(int i = 0, j = 0 ; i < n ; i++) {
			if(j < str2.length() && str2.charAt(j) == str1.charAt(i)) {
				if(str2.length() - 1 == j) {
					return i - str2.length() + 1;
				}
				j++;
			}
		}
		return -1;
	}
}

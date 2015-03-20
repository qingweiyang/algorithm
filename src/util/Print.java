package util;

public class Print {

	public static void printArray(int[] tmp, int len) {
		System.out.print("[");
		for(int i = 0 ; i < len-1 ; i ++) {
			System.out.print(tmp[i]+", ");
		}
		System.out.print(tmp[len-1]+"]");
		System.out.println();
	}
	
	public static void printArray(int[] tmp) {
		int len = tmp.length;
		System.out.print("[");
		for(int i = 0 ; i < len-1 ; i ++) {
			System.out.print(tmp[i]+", ");
		}
		System.out.print(tmp[len-1]+"]");
		System.out.println();
	}
	
}

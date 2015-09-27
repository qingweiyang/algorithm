package interview.jd;

import util.Print;

/**
 * 京东2面算法题
 * 
 * 2n个数，一半奇数，一半偶数，设计一个程序让奇数位上的数是奇数，偶数位上的是偶数
 * 
 * @author yqw
 *
 */
public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test[] = {0, 1, 1, 2, 3, 4, 0, 7};
		new Array_01().algorithm(test);
		
		Print.printArray(test);
	}

	/**
	 * 设置2个指针分别从0，1位开始
	 * 有四种情况：
	 * 		偶奇 （符合要求）
	 * 		奇偶 （两数位置对调）
	 * 		偶偶	（偶数位指针向前索引，步长为2，直到遇到奇数，与当前第2个偶数对换即可；这里 值置换，指针位置不换）
	 * 		奇奇 （与 偶偶 类似）
	 * @param sample
	 * @return
	 */
	public void algorithm(int[] sample) {
		for(int i = 0, j = 1 ; i < sample.length && j < sample.length ; i += 2, j += 2) {
			int itmp = sample[i]%2;
			int jtmp = sample[j]%2;
			if(itmp == 1 && jtmp == 0) {
				//奇偶 （两数位置对调）
			} else if(itmp == 0 && jtmp == 0) {
				//偶偶	
				while(sample[++i]%2 == 1);
			} else if(itmp == 1 && jtmp == 1) {
				while(sample[++j]%2 == 0);
				//奇奇
			} else {
				//偶奇 （符合要求）
				continue;
			}
			int tmp = sample[i];
			sample[i] = sample[j];
			sample[j] = tmp;
		}
	}
}

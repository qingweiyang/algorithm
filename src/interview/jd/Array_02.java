package interview.jd;

/**
 * 京东2面算法题
 * 
 * 有一个数组，定义某位的左边所有数的值与右边所有数的值相等，称该位为 “重位数”（自己想的，忘了原来名字），
 * 现在有一数组存在“重位数”，请找出该数组“重位数”的位置， 注意：数组中可能包含负数
 * （智力题）
 * 
 * @author yqw
 *
 */
public class Array_02 {

	public static void main(String[] args) {
		int sample[] = {-1, 0, 1, 0, 3, 0};
		System.out.println(new Array_02().algorithm(sample));
	}

	/**
	 * 纯智力题啊！！！
	 * 假设左右两侧和为x，则数组可表示为 [x, m, x]，先算出总和s=2x+m；
	 * 进行一次遍历，算出遍历当前位置的值总和k,假设此时遍历位置i，则当s-k = k + array[i + 1]时，找到“重位数”i
	 * （s-k = 2x+m - x = x+m = k + array[i+1]）
	 * 
	 * @param sample
	 * @return
	 * 		“重位数”位置，没有返回－1
	 */
	public int algorithm(int[] sample) {
		int s = 0;
		for(int i = 0 ; i < sample.length ; i++) {
			s += sample[i];
		}
		
		int k = 0;
		for(int i = 0 ; i < sample.length ; i++) {
			k += sample[i];
			if(i < sample.length - 1 && s - k == k + sample[i + 1]) {
				return i + 1;
			}
		}
		return -1;
	}
}

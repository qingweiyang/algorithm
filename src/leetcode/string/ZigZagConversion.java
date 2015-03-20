package leetcode.string;


/**
 * 
 * @author yqw
 *ZigZag Conversion
 *https://leetcode.com/problems/zigzag-conversion/
 *
 *convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 *
 */
public class ZigZagConversion {

	public static void main(String[] args) {
		ZigZagConversion z = new ZigZagConversion();
		
		System.out.println(z.convert("PAYPALISHIRING", 3));
	}

	public String convert(String s, int nRows) {
		int len = s.length();
		if(len == 0 || nRows <= 1)
			return s;
		
		String[] res = new String[nRows];
		for(int i = 0 ; i < nRows ; i++) {
			res[i] = "";
		}
		for(int i = 0 ; i < len ; i++) {
			//pos是i对应的char在转化后排列的行数
			int pos = i%(2*nRows-2);
			if(pos > nRows-1) {
				pos = nRows-2-pos%nRows;
			}
			res[pos] += s.charAt(i);
		}
		for(int i = 1 ; i < nRows ; i++) {
			res[0] += res[i];
		} 
		
		return res[0];
    }
}

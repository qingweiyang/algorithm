package leetcode.string;

/**
 * 
 * @author yqw
 *Add Binary
 *https://leetcode.com/problems/add-binary/
 *
 *
 */
public class AddBinary {

	public String addBinary(String a, String b) {
        StringBuffer res = new StringBuffer();
        int aindex = a.length()-1;
        int bindex = b.length()-1;
        int carry = 0;
        for(; aindex >= 0 || bindex >= 0 || carry != 0; aindex--, bindex--) {
        	int ax = 0;
        	if(aindex >= 0) {
        		ax = a.charAt(aindex)-'0';
        	} 
        	int bx = 0;
        	if(bindex >= 0 ) {
        		bx = b.charAt(bindex)-'0';
        	}
        	int result = (ax+bx+carry)%2;
        	res.insert(0, result);
        	carry = (ax+bx+carry)/2;
        }
    
        return res.toString();
    }
}

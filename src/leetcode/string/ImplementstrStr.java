package leetcode.string;

/**
 * 
 * @author yqw
 *Implement strStr() 
 *https://leetcode.com/problems/implement-strstr/
 *
 *Implement strStr().
 *Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 */
public class ImplementstrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementstrStr i = new ImplementstrStr();
		
		System.out.println(i.strStr("sdsa", "s"));
		System.out.println(i.strStr_01("sdsa", "s"));
		System.out.println(i.strStr_02("sdsa", "s"));
	}

	public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
	
	/**
	 * common way, time complexity is o(m*n)
	 * 
	 * @param haystack
	 * @param needle
	 * @return
	 */
	public int strStr_01(String haystack, String needle) {
		int pLen = haystack.length();
		int cLen = needle.length();
		
		int i = 0;
		int j = 0;
		while(i < pLen && j < cLen) {
			if(haystack.charAt(i++) != needle.charAt(j++)) {
				i = i-j+1;
				j = 0;
			}
		}
		
		if(j == cLen) {
			return i-j;
		} else {
			return -1;
		}
    }
	
	public int strStr_02(String haystack, String needle) {
		int i = 0;  
	    int j = 0;  
	    int sLen = haystack.length();  
	    int pLen = needle.length();  
	    int[] next = next(needle);
	    while (i < sLen && j < pLen)  
	    {  
	        //①如果j = -1，或者当前字符匹配成功（即S[i] == P[j]），都令i++，j++      
	        if (j == -1 || haystack.charAt(i) == needle.charAt(j))  
	        {  
	            i++;  
	            j++;  
	        }  
	        else  
	        {  
	            //②如果j != -1，且当前字符匹配失败（即S[i] != P[j]），则令 i 不变，j = next[j]      
	            //next[j]即为j所对应的next值        
	            j = next[j];  
	        }  
	    }  
	    if (j == pLen)  
	        return i - j;  
	    else  
	        return -1;  
    }
	
	private int[] next(String str) {
		int len = str.length();
		int next[] = new int[len];
		next[0] = -1;  
	    int k = -1;  
	    int j = 0;  
	    while (j < len - 1)  
	    {  
	        //p[k]表示前缀，p[j]表示后缀  
	        if (k == -1 || str.charAt(j) == str.charAt(k))   
	        {  
	            ++k;  
	            ++j;  
	            next[j] = k;  
	        }  
	        else   
	        {  
	            k = next[k];  
	        }  
	    }

		return next;
	}
}

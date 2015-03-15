package leetcode.array;


/**
 * 
 * @author yqw
 * 
 * Remove Duplicates from Sorted Array
 * 
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example,
 * Given input array A = [1,1,2],
 * Your function should return length = 2, and A is now [1,2].
 *
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates r = new RemoveDuplicates();
		
		int[] A = {1,1,2};
		int len = r.removeDuplicates(A);
		r.print(A, len);
	}

	public void print(int[] tmp, int len) {
		System.out.print("[");
		for(int i = 0 ; i < len-1 ; i ++) {
			System.out.print(tmp[i]+", ");
		}
		System.out.print(tmp[len-1]+"]");
		System.out.println();
	}
	
    public int removeDuplicates(int[] A) {
    	int len = A.length;
    	
    	if(len == 0)
    		return 0;
    	
    	int first = 0;
    	for(int last = 0; last < len; last++) {
    		if(A[first] != A[last]) {
    			A[++first] = A[last];
    		}
    	}
    	
    	return first+1;
    }
    
}

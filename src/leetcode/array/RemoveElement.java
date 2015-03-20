package leetcode.array;

/**
 * 
 * @author yqw
 *
 *Given an array and a value, remove all instances of that value in place and return the new length.
 *
 *The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 */
public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveElement r = new RemoveElement();
		
		int[] A = {1,1,2};
		int len = r.removeElement(A, 0);
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
	
    public int removeElement(int[] A, int elem) {
    	int len = A.length;
    	for(int i = 0 ; i < len ; ) {
    		if(A[i] == elem) {
    			A[i] = A[--len];
    		} else {
    			i++;
    		}
    	}
        return len;
    }
}

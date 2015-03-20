package leetcode.array;

import util.Print;

/**
 * 
 * @author yqw
 *
 *Merge Sorted Array
 *https://leetcode.com/problems/merge-sorted-array/
 *
 *Given two sorted integer arrays A and B, merge B into A as one sorted array.
 *
 *Note:
 *You may assume that A has enough space (size that is greater or equal to m + n) to hold additional 
 *elements from B. The number of elements initialized in A and B are m and n respectively.
 *
 */
public class MergeSortedArray {

	public static void main(String[] args) {
		MergeSortedArray m = new MergeSortedArray();
		int[] a = {1,2,3,0,0};
		int[] b = {5,6};
		m.merge(a, 3, b, 2);
		Print.printArray(a);
	}

    public void merge(int A[], int m, int B[], int n) {
    	int inxa = m-1;
    	int inxb = n-1;
    	int index = m+n-1;
    	
    	while(inxa >= 0 && inxb >= 0) {
    		if(B[inxb] > A[inxa]) {
    			A[index--] = B[inxb--];
    		} else {
    			A[index--] = A[inxa--];
    		}
    	}
    	
    	if(inxa >= 0) {
    		System.arraycopy(A, 0, A, index-inxa, inxa+1);
    	}
    	if(inxb >= 0) {
    		System.arraycopy(B, 0, A, index-inxb, inxb+1);
    	}
    }
}

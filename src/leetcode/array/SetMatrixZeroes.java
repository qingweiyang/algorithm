package leetcode.array;

import util.Print;

/**
 * https://leetcode.com/problems/set-matrix-zeroes/
 * 
 * @author yqw
 *
 */
public class SetMatrixZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[[0,0,0,5],[4,3,1,4],[0,1,1,4],[1,2,1,3],[0,0,1,1]]
//		int[][] a = {{0,0,0,5},{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}};
//		int[][] a = {{1,1,1},{1,2,3},{0,1,2}};
		int[][] a = {{1,1,1},{0,1,2}};
//		int[][] a = {{-4,-2147483648,6,-7,0},{-8,6,-8,-6,0},{2147483647,2,-9,-6,-10}};
		
		SetMatrixZeroes s = new SetMatrixZeroes();
		s.setZeroes(a);
		Print.printArray(a);
	}

	/**
	 * 对于m*n的矩阵，分两次遍历，第一次遍历标记出现0的行/列，将其标记再该行/列的第一个位置；
	 * （第二行注意不能互相影响）
	 * 第二次遍历只需读第一行/列，遇到0的将该行/列全部标记为0，否则不变
	 * 
	 * @param matrix
	 */
    public void setZeroes(int[][] matrix) {
        if(matrix.length == 0) {
        	return ;
        }
        int col0 = 1;
        
        for(int i = 0 ; i < matrix.length ; i++) {
        	//由于(0,0)位置收到第一行，列的相互影响
        	if(matrix[i][0] == 0) {
        		col0 = 0;
        	}
        	for(int j = 1 ; j < matrix[0].length ; j++) {
        		if(matrix[i][j] == 0) {
        			matrix[i][0] = 0;
        			matrix[0][j] = 0;
        		}
        	}
        }
        
        //根据标记为为每个数赋值，倒序
       for(int i = matrix.length - 1 ; i >= 0 ; i--) {
    	   for(int j = matrix[0].length - 1 ; j >= 1 ; j--) {
    		   if(matrix[i][0] == 0 || matrix[0][j] == 0) {
    			   matrix[i][j] = 0;
    		   }
    	   }
    	   if(col0 == 0) {
    		   matrix[i][0] = 0;
    	   }
       }
    }
}

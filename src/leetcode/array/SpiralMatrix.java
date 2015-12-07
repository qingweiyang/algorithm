package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/spiral-matrix/
 * 
 * @author yqw
 *
 */
public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiralMatrix s = new SpiralMatrix();
		int matrix[][] = {{1, 2, 3}, {3, 4, 5}};
		List<Integer> res = s.spiralOrder(matrix);
		for(int i : res) {
			System.out.print(i + ",");
		}
	}

    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> res = new ArrayList<Integer>();
    	if(matrix.length == 0) {
    		return res;
    	}
    	
        int m = matrix.length;
        int n = matrix[0].length + 1;
        int count = m * (n - 1);
        int dir[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; //顺时针4个方向
        int indexDir = -1; //方向转动的次数
        
        int row = 0, col = -1;
        while(count > 0) {
        	indexDir = (indexDir + 1) % 4;
        	n--;
        	
        	for(int i = n ; i > 0 ; i--) {
        		row += dir[indexDir][0];
        		col += dir[indexDir][1];
        		res.add(matrix[row][col]);
        		count--;
        	}

        	//swap n, m
        	int tmp = m;
        	m = n; 
        	n = tmp;
        }
        
        return res;
    }
}

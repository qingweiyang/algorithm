package leetcode.array;

public class SpiralMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiralMatrixII s = new SpiralMatrixII();
		int[][] res = s.generateMatrix(3);
		
		for(int i = 0 ; i < res.length ; i++) {
			for(int j = 0 ; j < res[0].length ; j++) {
				System.out.print(res[i][j] + ",");
			}
			System.out.println();
		}
	}

    public int[][] generateMatrix(int n) {
    	if(n <= 0) {
    		return new int[][]{};
    	}
    	int res[][] = new int[n][n];
    	
    	int count = 0;
    	int dir[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    	int indexDir = -1;
    	int row = 0, col = -1;
    	int i = n, j = n + 1;
    	
    	while(count < n * n) {
    		indexDir = (indexDir + 1) % 4;
    		j--;
    		
    		for(int k = j ; k > 0 ; k--) {
    			row += dir[indexDir][0]; 
    			col += dir[indexDir][1];
    			res[row][col] = ++count;
    		}
    		
    		//swap  i,j
    		int tmp = i;
    		i = j;
    		j = tmp;
    	}
    	
    	return res;
    }
}

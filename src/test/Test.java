package test;

import leetcode.array.TwoSum;

public class Test {

    public static void main(String []args){
//        UniquePaths_02 u = new UniquePaths_02();
//        int obstacleGrid[][] = {{1, 0}};
//        System.out.print(u.uniquePathsWithObstacles(obstacleGrid));
    	
    	TwoSum t = new TwoSum();
    	int[] numbers={2, 7, 11, 15};
    	int target=9;
    	System.out.print(t.twoSum(numbers, target)[0] + "," + t.twoSum(numbers, target)[1]);
    }
}

package test;

import leetcode.array.UniquePaths_02;

public class Test {

    public static void main(String []args){
        UniquePaths_02 u = new UniquePaths_02();
        int obstacleGrid[][] = {{1, 0}};
        System.out.print(u.uniquePathsWithObstacles(obstacleGrid));
    }
}

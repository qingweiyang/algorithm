package test;

import leetcode.tree.TreeNode;
import leetcode.tree.ValidateBinarySearchTree;

public class Test {

    public static void main(String []args){
//        UniquePaths_02 u = new UniquePaths_02();
//        int obstacleGrid[][] = {{1, 0}};
//        System.out.print(u.uniquePathsWithObstacles(obstacleGrid));
    	
//    	TwoSum t = new TwoSum();
//    	int[] numbers={2, 7, 11, 15};
//    	int target=9;
//    	System.out.print(t.twoSum(numbers, target)[0] + "," + t.twoSum(numbers, target)[1]);
    	
//    	Triangle t = new Triangle();
//    	List<List<Integer>> res = new ArrayList<List<Integer>>();
//    	List<Integer> tmp = new ArrayList<Integer>();
//    	tmp.add(2);
//    	res.add(tmp);
//    	List<Integer> tmp2 = new ArrayList<Integer>();
//    	tmp2.add(3);
//    	tmp2.add(4);
//    	res.add(tmp2);
//    	List<Integer> tmp3 = new ArrayList<Integer>();
//    	tmp3.add(6);
//    	tmp3.add(5);
//    	tmp3.add(7);
//    	res.add(tmp3);
//    	List<Integer> tmp4 = new ArrayList<Integer>();
//    	tmp4.add(4);
//    	tmp4.add(1);
//    	tmp4.add(8);
//    	tmp4.add(3);
//    	res.add(tmp4);
//    	
//    	System.out.println(t.minimumTotal(res));
    	
    	Test t = new Test();
    	t.testValidateBinarySearchTree();
    }
    
    public void testValidateBinarySearchTree() {
    	ValidateBinarySearchTree v = new ValidateBinarySearchTree();
    	TreeNode t = new TreeNode(5);
    	t.left = new TreeNode(3);
    	t.left.right = new TreeNode(4);
    	t.right = new TreeNode(6);
    	System.out.println(v.isValidBST(t));
    }
}

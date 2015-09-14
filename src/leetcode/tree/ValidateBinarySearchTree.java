package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {
	private List<Integer> list = new ArrayList<Integer>();
	
    public boolean isValidBST(TreeNode root) {
    	midOrder(root);
    	for(int i = 0 ; i < list.size() - 1 ; i++) {
    		if(list.get(i) >= list.get(i + 1)) 
    			return false;
    	}
    	return true;
    }
    
    private void midOrder(TreeNode node) {
    	if(node == null) {
    		return ;
    	}
    	midOrder(node.left);
    	list.add(node.val);
    	midOrder(node.right);
    }
}
 

package others.tree;

import java.util.Stack;

import util.TreeNode;

public class NoRecursion {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(2);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(7);
		root.right.right = new TreeNode(6);
		new NoRecursion().inOrder(root);
		System.out.println();
		new NoRecursion().preOrder(root);
	}

	/**
	 * 中序
	 * 
	 * @param root
	 */
	public void inOrder(TreeNode root) {
		if(root == null) {
			return ;
		}
		
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode node = root;
		while(!s.empty() || node != null) {
			if(node != null) {
				s.push(node);
				node = node.left;
			} else {
				node = s.pop();
				System.out.print(node.val + ",");
				node = node.right;
			}
		}
		
	}
	
	/**
	 * 先序
	 * 
	 * @param root
	 */
	public void preOrder(TreeNode root) {
		if(root == null) {
			return ;
		}
		
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		while(!s.empty()) {
			TreeNode node = s.peek();
			if(node != null) {
				System.out.print(node.val + ",");
				s.push(node.left);
			} else {
				//空值出栈
				s.pop();
				if(!s.empty()) {
					s.push(s.pop().right);
				}
			}
		}
	}
}

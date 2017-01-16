package T022_从上往下打印二叉树;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	
	 public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
	        
	        ArrayList ls = new ArrayList();
	    	
	        if (root==null ) return ls;
	        Queue q = new LinkedList();
	        if(root!=null)
	        	q.add(root);
	        while(!q.isEmpty()){
	        	TreeNode temp = (TreeNode) q.poll();
	        	ls.add(temp.val);
	        	if(temp.left!=null)
	        		q.add(temp.left);
	        	if(temp.right!=null)
	        		q.add(temp.right);
	        }
	        
	        return ls;
	    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

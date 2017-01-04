package T101_SymmetricTree;

import java.util.LinkedList;
import java.util.Queue;


public class Solution {

    public boolean isSymmetric(TreeNode root) {
        
    	Queue q = new LinkedList();
    	
    	q.offer(root);
    	q.offer(root);
    	
       while(!q.isEmpty()){
    	   
    	   TreeNode t1 = (TreeNode) q.poll();
    	   TreeNode t2 = (TreeNode) q.poll();
    	   
    	   if(t1==null && t2==null) continue;
    	   if(t1==null || t2==null) return false;
    	   
    	   if(t1.val!=t2.val) return false;
    	   
    	   q.add(t1.left);
    	   q.add(t2.right);
    	   
    	   q.add(t1.right);
    	   q.add(t2.left);
    	   
       }
    	
       return true;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

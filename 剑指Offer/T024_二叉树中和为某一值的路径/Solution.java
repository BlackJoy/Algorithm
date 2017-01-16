package T024_二叉树中和为某一值的路径;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	Stack stk = new Stack();
	ArrayList resList = new ArrayList();
	ArrayList ls = new ArrayList();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        
    	if(root==null) return resList;
    	
    	if(root.left == null && root.right == null){
    		//到叶子节点
    		stk.push(root.val);
    		ls = new ArrayList();
    		int sum = 0 ;
    		int length = stk.size();
    		for(int i = 0 ; i < length ; i ++){
    			int temp = (Integer) stk.get(i);
    			ls.add(temp);
    			sum+=temp;
    		}
    		if(sum==target)
    			resList.add(ls);
    		stk.pop();
    	}
    	if(root.left!=null){
    		stk.push(root.val);
    		FindPath(root.left,target);
    		stk.pop();
    	}
    	if(root.right!=null){
    		stk.push(root.val);
    		FindPath(root.right,target);
    		stk.pop();
    	}
    	return resList;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

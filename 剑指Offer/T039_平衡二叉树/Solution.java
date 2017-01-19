package T039_平衡二叉树;

public class Solution {
	
    boolean flag = true;
    public boolean IsBalanced_Solution(TreeNode root) {        
        TreeDepth(root);      
        return flag;
    }
    
    
     public int TreeDepth(TreeNode root) {
         
        if(root == null) return 0;
         
    	int left = TreeDepth(root.left);
    	int right = TreeDepth(root.right);
    	if(Math.abs(left-right)>1)	flag = false;
         
    	return Math.max(left, right)+1;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

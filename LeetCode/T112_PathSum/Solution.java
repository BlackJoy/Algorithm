package T112_PathSum;

public class Solution {
    int temp = 0 ;
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int sum) {
    	
    	
        if(root == null ) return  false;
      
        if(root.left == null && root.right == null){
        	temp+=root.val;
            if(temp == sum ) flag = true ;
            temp-=root.val;
        }
        else{
            if(root.left!=null){
                temp+=root.val;
                hasPathSum(root.left,sum);
                temp-=root.val;
            }
            if(root.right!=null){
            	temp+=root.val;
                hasPathSum(root.right,sum);
                temp-=root.val;
            }
                
        }
        
        return flag;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(-2);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.left.left.left = new TreeNode(-1);
		
		root.right = new TreeNode(-3);
		root.right.left = new TreeNode(-2);
		
		boolean res = s.hasPathSum(root, 2);
		System.out.println(res);
	}

}

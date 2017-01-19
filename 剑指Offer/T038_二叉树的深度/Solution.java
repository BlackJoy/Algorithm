package T038_二叉树的深度;

public class Solution {
    int depth = 0;
    int max = 0;
    public int TreeDepth(TreeNode root) {
        
    	//Solution 1
    	
    	if(root == null) return 0;
    	
    	int left = TreeDepth(root.left);
    	int right = TreeDepth(root.right);
    	
    	return Math.max(left, right)+1;
    	
    	//Solution2
//        if(root == null) return 0;
//        
//        if(root.left==null && root.right==null){
//            if(depth>max)
//                max = depth;
//        }
//        
//        if(root.left!=null){
//            depth++;
//            TreeDepth(root.left);
//            depth--;
//        }
//        if(root.right!=null){
//            depth++;
//            TreeDepth(root.right);
//            depth--;
//        }
//        return max+1;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package T111_MinimumDepthOfBinaryTree;

public class Solution {
	int depth = 1; 
    int min =  Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            if(depth < min ) min = depth ;
        }
        else{
            if(root.left!=null){
                depth++;
                minDepth(root.left);
                depth--;
            }
            if(root.right!=null){
                depth++;
                minDepth(root.right);
                depth--;
            }
                
        }
        return min ; 
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2); 
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
			
		int res = s.minDepth(root);
		System.out.println(res);
	}

}

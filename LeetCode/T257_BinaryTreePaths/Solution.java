package T257_BinaryTreePaths;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	StringBuilder temp = new StringBuilder();
    List ls = new ArrayList();
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        if(root==null) return ls;
        
        if(root.left==null && root.right==null ){
        	temp.append(root.val);
            ls.add(temp);
            temp = new StringBuilder();
        }else{
            
            
            if(root.left!=null){
            	temp.append(root.val);
                temp.append("->");
                binaryTreePaths(root.left);    
            }
            
            if(root.right!=null){
            	temp.append(root.val);
                temp.append("->");
                binaryTreePaths(root.right);    
            }
        }
        return ls;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = null;
		root.right.right = null;
		
		root.left.left = null;
		root.left.right = new TreeNode(5);
		root.left.right.left = null;
		root.left.right.right = null;
		
		s.binaryTreePaths(root);
	}

}

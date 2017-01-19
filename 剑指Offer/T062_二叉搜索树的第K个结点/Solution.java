package T062_二叉搜索树的第K个结点;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
//    List ls = new ArrayList();
//    List t_ls = new ArrayList();
//    TreeNode KthNode(TreeNode pRoot, int k)
//    {
//        
//        if(pRoot==null) return null;
//        if(k<=0 ) return null;
//        int number = getTreeNumber(pRoot);
//        if(number<k) return null;
//                  
//        Collections.sort(ls);    
//            
//        for(int i = 0 ; i < t_ls.size(); i++){
//            TreeNode temp = (TreeNode) t_ls.get(i);
//            if(temp.val== (Integer)ls.get(k-1)){
//                return temp;
//            }
//        }
//        return null;
//    }
//	
//   
//    
//    int getTreeNumber(TreeNode root){
//        
//        if(root==null) return 0;
//		ls.add(root.val);
//        t_ls.add(root);
//        int left = getTreeNumber(root.left);
//        int right = getTreeNumber(root.right);
//        
//        return left+right+1;
//        
//    }
	
	
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot == null || k ==0) return null;
        TreeNode res = MidSearch(pRoot , k );
        return res;
        
    }
    
    TreeNode MidSearch(TreeNode pRoot,int k){
    	TreeNode res = null;
        if(pRoot.left!=null){
            res = MidSearch(pRoot.left,k);
        }
        
        if(res==null && k==1){
        	res = pRoot;
        	k--;
        }
        
        if(pRoot.right!=null){
            res = MidSearch(pRoot.right,k);
        }
		return res;
       
    }
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		s.KthNode(root,2);
		
	}

}

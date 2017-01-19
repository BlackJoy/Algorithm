package T060_把二叉树打印成多行;

import java.util.ArrayList;

public class Solution {

    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    	
        ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer> >();
        ArrayList<TreeNode> ls1 = new ArrayList<TreeNode>();
        ArrayList<TreeNode> ls2 = new ArrayList<TreeNode>();
        ArrayList<Integer> ls = new ArrayList<Integer>();
        
        if(pRoot==null) return res;
        
        int depth = GetDepth(pRoot);
        
        ls.add(pRoot.val);
        ls1.add(pRoot);
        res.add(ls);
        
        for(int i = 2 ; i <= depth ; i++){
        	
            if(i%2==1){
            	ls1 = new ArrayList<TreeNode>();
                ls = new ArrayList<Integer>();
                
                for(int j = 0 ; j < ls2.size();j++){


                    TreeNode temp = (TreeNode)ls2.get(j);
                    if(temp.left!=null){
						ls1.add(temp.left);
                        ls.add(temp.left.val);
                    }
                    if(temp.right!=null){
                        ls1.add(temp.right);
                        ls.add(temp.right.val);
                    }
                }
                res.add(ls);
            
            }else{
                ls2 = new ArrayList<TreeNode>();
                ls = new ArrayList<Integer>();
                
                for(int j = 0 ; j < ls1.size();j++){


                    TreeNode temp = (TreeNode)ls1.get(j);
                    if(temp.left!=null){
						ls2.add(temp.left);
                        ls.add(temp.left.val);
                    }
                    if(temp.right!=null){
                        ls2.add(temp.right);
                        ls.add(temp.right.val);
                    }
                }
                res.add(ls);
                
            }
                
        }
        
        return res;
    }
    
    int GetDepth(TreeNode pRoot){
        if(pRoot == null) return 0;
        
        int left = GetDepth(pRoot.left);
        int right = GetDepth(pRoot.right);
        
        return Math.max(left,right)+1;
        
    }
    
	
	public	static void main(String[] args){
		
		Solution s = new Solution();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		s.Print(root);
	}
	
}

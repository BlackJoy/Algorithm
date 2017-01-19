package T059_按之字形顺序打印二叉树;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer> >();
        ArrayList<Integer> l1 = new ArrayList<Integer>();//奇数行 从左到右打印
        ArrayList<Integer> l2 = new ArrayList<Integer>();//偶数行 从右到左打印
        
        ArrayList<TreeNode> N1 = new ArrayList<TreeNode>();
        ArrayList<TreeNode> N2 = new ArrayList<TreeNode>();
        
        
        if(pRoot == null) return res;
        
        int deep = getDeep(pRoot);
        
        for(int i = 1 ; i <= deep ;i ++ ){
            
        	if(i%2==1){
                l1 = new ArrayList<Integer>();
                N1 = new ArrayList<TreeNode>();
                if(l2.size()==0){
                    N1.add(pRoot);
                    l1.add(pRoot.val);
                    res.add(l1);
                }else{
                    
                    for(int j = 0 ; j< N2.size() ; j++){
                        TreeNode temp = (TreeNode)N2.get(j);
                        if(temp.left!=null){
                            N1.add(temp.left);
                            l1.add(temp.left.val);
                        }
                        if(temp.right!=null){
                            N1.add(temp.right);
                            l1.add(temp.right.val);
                        }
                    }
                   
                    res.add(l1);
                    
                }
                
            }else{
                 l2 = new ArrayList<Integer>();
                 N2 = new ArrayList<TreeNode>();
                 
                 for(int j = 0 ; j < N1.size() ; j++){
                     TreeNode temp = (TreeNode)N1.get(j);
                     if(temp.left!=null){
                         N2.add(temp.left);
                     }
                     if(temp.right!=null){
                         N2.add(temp.right);
                     }
                 }
                	
                 for(int j = N2.size()-1; j>=0;j--){                     
                     l2.add((Integer)N2.get(j).val);                     
                 }
                
                 res.add(l2);
                
            } 
            
        }
		
        return res;
      	        
    }
    
    
    public int getDeep (TreeNode pRoot){
        
        if(pRoot == null) return 0;
        
        int left = getDeep(pRoot.left);
        int right = getDeep(pRoot.right);
        
        return Math.max(left,right) + 1;
        
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
		s.Print(root);
	}

}

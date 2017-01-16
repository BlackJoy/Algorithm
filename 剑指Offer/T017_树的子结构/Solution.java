package T017_树的子结构;

public class Solution {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean flag = false;
        if(root1!=null && root2!=null){
            
            if(root1.val == root2.val)
                flag = JungleTheSameTree(root1,root2);
            if(!flag)
                flag = JungleTheSameTree(root1.left,root2);
            if(!flag)
                flag = JungleTheSameTree(root1.right,root2);
            
        }
        
        return flag;
    }
    
    public boolean JungleTheSameTree(TreeNode root1,TreeNode root2) {
        if(root2==null) return true;
        if(root1==null) return false;
        if(root1.val != root2.val) return false;
        return JungleTheSameTree(root1.left,root2.left) && JungleTheSameTree(root1.right,root2.right);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package T058_对称二叉树;

public class Solution {
	
    boolean isSymmetrical(TreeNode pRoot)
    {
       return jungle(pRoot,pRoot);
    }
    
    public boolean jungle(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)  && jungle(t1.right, t2.left) && jungle(t1.left, t2.right);
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package T004_重建二叉树;

import java.util.Arrays;

public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    
    	//二叉树的前序遍历中，第一个数字总是树的根结点
    	//在中序遍历中，根结点在序列的中间，左子树的结点位于根结点的左边，右子树的结点位于根结点的右边
    	
        if(pre.length == 0 || in.length == 0 || pre.length!=in.length) return null;        
        TreeNode root = new TreeNode(pre[0]);
        for(int i = 0 ; i < in.length ; i++){
            if(in[i]==pre[0]){
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1,in.length));

            }
        }
        return root;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

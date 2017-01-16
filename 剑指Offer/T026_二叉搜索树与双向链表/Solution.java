package T026_二叉搜索树与双向链表;

public class Solution {
	TreeNode head = null;
	TreeNode tail = head;
	TreeNode pre = head;
    public TreeNode Convert(TreeNode pRootOfTree) {
        
    	if(pRootOfTree == null) return null;
    	
    	addNode(pRootOfTree);

    	return head;
    }
    
    
	private void addNode(TreeNode pRootOfTree) {
		// TODO Auto-generated method stub
		if(pRootOfTree.left!=null)
			addNode(pRootOfTree.left);
    	
		TreeNode node = new TreeNode(pRootOfTree.val);
		
    	if(head == null)
    		head = node;
    	else{
    		tail.right = node;
    	}
    	pre = tail;
    	tail = node;
    	tail.left = pre;
    	
    	if(pRootOfTree.right!=null)
    		addNode(pRootOfTree.right);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

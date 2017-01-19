package T057_二叉树的下一个结点;

public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null) return null;
        
        TreeLinkNode pNext = null;
        //如果该结点有右子树，那下一个结点是右子树的最左结点
        if(pNode.right!=null){
        	TreeLinkNode pRight = pNode.right;
            while(pRight.left!=null){
                pRight = pRight.left;
            }
            
            pNext = pRight;
        }
        //如果下一个结点是根结点
        else if(pNode.next!=null){
            TreeLinkNode pCurrent = pNode;
            TreeLinkNode pParent = pNode.next;
            //找到父节点，如果当前结点是父节点的左结点，则父节点为next
            //否则，向上找到当前结点是父节点的左结点的父节点
            while(pParent!=null && pCurrent==pParent.right){
                pCurrent = pParent;
                pParent = pParent.next;
            }
            pNext = pParent;
        }
        
        return pNext;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

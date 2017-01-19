package T055_链表中环的入口节点;

public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        
        if(pHead==null || pHead.next==null) return null;
        //慢结点走两步，快结点走一步
        ListNode l1 = pHead;
        ListNode l2 = pHead;
        
        while(l1!=null && l2 !=null){
            l1 = l1.next;
            l2 = l2.next.next;
            if(l1==l2){
            	//此时l1比l2多走了一个环的距离
                //将pHead赋给l2，pHead再走一个环的距离就能找到入口
                l2 = pHead;
                while(l1!=l2){
                    l1 = l1.next;
                    l2 = l2.next;
                }
                if(l1==l2)
                    return l1;
            }
        }
        
        return null;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

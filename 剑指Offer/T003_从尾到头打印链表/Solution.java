package T003_从尾到头打印链表;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        
        ArrayList ls = new ArrayList();
        ArrayList res = new ArrayList();
    	
        if(listNode == null) return res;
        
        ListNode temp = listNode;
        
        ls.add(listNode.val);
        
        while(temp.next!=null){
        	ls.add( temp.next.val );
        	temp = temp.next;
        }
        
        for(int i = ls.size()-1 ; i >= 0 ; i -- ){
        	res.add(ls.get(i));
        }
        return (ArrayList<Integer>) res;
        
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution ();
		//67,0,24,58
		ListNode node = new ListNode(67);
		node.next = new ListNode(0);
		node.next.next = new ListNode(24);
		node.next.next.next = new ListNode(58);
		s.printListFromTailToHead(node);
	}

}

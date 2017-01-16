package T015_反转链表;

public class Solution {
    public ListNode ReverseList(ListNode head) {
		
        if(head == null) return null;
        if(head.next == null) return head;
        
        ListNode cur = head;
        ListNode nex = head.next;
        
        while(nex!=null){
           
            
            ListNode last = cur;

            cur = nex ;
           
            nex = nex.next;
            
            cur.next = last;
        }
        
        head.next = null;
        
        return cur;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

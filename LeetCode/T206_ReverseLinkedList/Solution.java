package T206_ReverseLinkedList;

public class Solution {
	
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        
        ListNode pre = null;
        ListNode cur = null;
        ListNode nex = null;
        
        if(head.next!=null){
            pre = head;
            cur = head.next;
        }
        
        while(cur.next!=null){
            nex = cur.next;
            cur.next = pre;
            
            pre = cur;
            cur = nex;
            
        }
        
        cur.next = pre;
        head.next = null;
        
        return cur;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode head1 = new ListNode(2);
		ListNode head2 = new ListNode(3);
		
		head.next = head1;
		head1.next = head2;
		
		Solution s = new Solution();
		s.reverseList(head);
	}

}

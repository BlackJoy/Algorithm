package T056_删除链表中重复结点;

public class Solution {
    public ListNode deleteDuplication(ListNode pHead){
		
        ListNode q, p, r;
        p = pHead;
        q = r = null;
 
        while (p != null) {
            boolean flag = false;
            r = p.next;
            while (r != null && r.val == p.val) {
                flag = true;
                r = r.next;
            }
            if (flag) {
                if (q != null)
                    q.next = r;
                else
                    pHead = null; //刚开始就碰到重复的情况
            } else {
                if (q == null)
                    pHead = p;  // p.val!=r.val 并且没有前驱结点
                q = p;
            }
            p = r;
        }
 
        return pHead;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(3);
//		head.next.next.next.next = new ListNode(4);
//		head.next.next.next.next.next = new ListNode(4);
//		head.next.next.next.next.next.next = new ListNode(5);
		
		s.deleteDuplication(head);
	}

}

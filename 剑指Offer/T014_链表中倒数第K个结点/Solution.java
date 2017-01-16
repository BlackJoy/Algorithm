package T014_链表中倒数第K个结点;

public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
		
        if(head==null) return null;
        
        int length =0 ;
        
        ListNode temp = head;
        
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        
        int index = length-k;
        if(index<0) return null;
        
        while(index!=0){
            head = head.next;
            index--;
        }
        
        return head;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

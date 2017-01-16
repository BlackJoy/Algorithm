package T016_合并两个排序的链表;

public class Solution {
	   public ListNode Merge(ListNode list1,ListNode list2) {
	    	if(list1==null ) return list2;
	        if(list2==null) return list1;
	        
	        ListNode head = null;
	        
	          if(list1.val<=list2.val){
	                head = new ListNode(list1.val);
	            	head.next = Merge(list1.next,list2);
	            }else{
	                head = new ListNode(list2.val);
	                head.next = Merge(list1,list2.next);
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

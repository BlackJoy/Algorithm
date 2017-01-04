package T234_PalindromeLinkedList;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isPalindrome(LinkNode head) {
        
        if(head == null) return true;
        else{
            List ls = new ArrayList();
            
            while(head!=null){
                ls.add(head.val);
                head = head.next;
            }
            int i = 0;
            for(  ; i <= ls.size()/2 ;i++){
            	if( ls.get(i).equals(ls.get(ls.size()-i-1)) )
            		continue;
            	else break;
            }
            
            if( i > ls.size()/2 )
            	return true;
            else return false;
        }
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		LinkNode node = new LinkNode(-16557);
		node.next = new LinkNode(-8725);
		node.next.next = new LinkNode(-29125);
		node.next.next.next = new LinkNode(-29125);
		node.next.next.next.next = new LinkNode(-8725);
		node.next.next.next.next.next = new LinkNode(-16557);
		//[-16557,-8725,-29125,28873,-21702,15483,-28441,-17845,-4317,-10914,-10914,-4317,-17845,-28441,15483,-21702,28873,-29125,-8725,-16557]
		boolean flag = s.isPalindrome(node);
		System.out.println(flag);
	}

}

package T036_两个链表的第一个公共结点;

import java.util.ArrayList;
import java.util.List;

public class Solution {
//	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
// 		if( pHead1==null || pHead2==null) return null;
//        
//        List ls1 = new ArrayList();
//        List ls2 = new ArrayList();
//        
//        while(pHead1!=null){
//        	ls1.add(pHead1);
//            pHead1 = pHead1.next;
//        }
//        while(pHead2!=null){
//            ls2.add(pHead2);
//            pHead2 = pHead2.next;
//        }
//        
//        for(int i = 0 ; i < ls1.size();i++){
//            for(int j = 0 ;j < ls2.size();j++){
//                if( (ListNode)ls1.get(i)==(ListNode)ls2.get(j)){
//                    return (ListNode)ls1.get(i);
//                }
//            }
//        }
//        
//        return null;
//    }
	
	//利用尾部长度   先将较长的链表后移 m-n个长度
	public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
		if(pHead1==null || pHead2==null) return null;
        
        ListNode temp = pHead1;
        int len1=0;
        while(temp!=null){
            len1++;
            temp = temp.next;
        }
        temp = pHead2;
        int len2=0;
        while(temp!=null){
            len2++;
            temp = temp.next;
        }
        int min = Math.min(len1,len2);
        if(len1<len2){
            int n = len2-len1;
            while(n!=0){
                --n;
                pHead2 = pHead2.next;
            }
        }else if(len1>len2){
            int n = len1-len2;
            while(n!=0){
                --n;
                pHead1 = pHead1.next;
            }
        }
        
        while(min!=0){
            
            if(pHead1==pHead2){
                return pHead1;
            }else{
                
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }
            min--;
        }
        return null;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode temp = new ListNode(6);
		temp.next = new ListNode(7);
		
		ListNode p1 = new ListNode(1);
		p1.next = new ListNode(2);
		p1.next.next = new ListNode(3);
		p1.next.next.next = temp;
		ListNode p2 = new ListNode(4);
		p2.next = new ListNode(5);
		p2.next.next = temp;
		
		Solution s = new Solution();
		s.FindFirstCommonNode1(p1, p2);
	}

}

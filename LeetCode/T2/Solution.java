package T2;
public class Solution {
    
    public ListNode head;
    public ListNode current;
    
    
    public void add(int data){
        if(head == null){
            head = new ListNode(data);
            current = head;
        }else{
            current.next = new ListNode(data);
            current = current.next;
        }
    }
    
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int flag = 0;
        while(l1!=null && l2!=null){
            if(flag == 0){
                if(l1.val+l2.val<10){
                    this.add(l1.val+l2.val);
                    flag = 0;
                }
                if(l1.val+l2.val>=10){
                    flag = 1;
                    this.add(l1.val+l2.val-10);
                }
                l1 = l1.next;
                l2 = l2.next;
                continue;
            }
            if(flag == 1){
                if(l1.val+l2.val+1<10){
                    this.add(l1.val+l2.val+1);
                    flag = 0;
                }
                if(l1.val+l2.val+1>=10){
                    flag = 1;
                    this.add(l1.val+l2.val+1-10);
                }
                
                l1 = l1.next;
                l2 = l2.next;
                continue;
            }
        }
       
        while(l1!=null && l2 == null){
            if(flag ==0 ){
                this.add(l1.val);
                l1 = l1.next;
                continue;
            }
            if(flag == 1){
                if(l1.val+1<10){
                    this.add(l1.val+1);
                    flag = 0;
                }
                if(l1.val+1>=10){
                    flag = 1;
                    this.add(l1.val+1-10);
                }
                l1 = l1.next;
                continue;
            }
            
        }
         while(l1==null && l2 != null){
            if(flag ==0 ){
                this.add(l2.val);
                l2 = l2.next;
                continue;
            }
            if(flag == 1){
                if(l2.val+1<10){
                    this.add(l2.val+1);
                    flag = 0;
                }
                if(l2.val+1>=10){
                    flag = 1;
                    this.add(l2.val+1-10);
                }
                l2 = l2.next;
                continue;
            }
            
        }
        
        if(l1 == null && l2 == null){
            if(flag == 1){
                this.add(1);  
            }
            
        }
        
        return head;
    }
    
    
    
    public void print(ListNode node) {
    	 if (node == null) {
    	 return;
    	 }
    	 
    	current = node;
    	 while (current != null) {
    	 System.out.println(current.val);
    	 current = current.next;
    	 }
    	} 
    
   
   
}
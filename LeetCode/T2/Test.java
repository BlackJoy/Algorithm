package T2;

public class Test {

	
	public static void main(String[] args) {
    	Solution list = new Solution();
    	ListNode l1 = new ListNode(5);
    	ListNode l2 = new ListNode(5);
 
    	//向LinkList中添加数据
    	
    	ListNode res = list.addTwoNumbers(l1,l2);
    	 
    	 list.print(res);// 从head节点开始遍历输出
    }
	

}

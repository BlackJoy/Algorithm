package T005_用两个栈实现队列;

import java.util.Iterator;
import java.util.Stack;

public class Soltuion {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	stack1.push(node);
    }
    
    public int pop() {
    	if(stack1.isEmpty()) return -1;

    	while(!stack1.isEmpty()){
    		stack2.push(stack1.pop());
    	}
    	
    	int res = stack2.pop();
    	
    	while(!stack2.isEmpty()){
    		stack1.push(stack2.pop());
    	}
    	return res;
    }
	
    //实现带min函数的最小栈
    
//	Stack stk = new Stack();
//    
//    public void push(int node) {
//        stk.push(node);
//    }
//    
//    public void pop() {
//        if(!stk.isEmpty())
//       		stk.pop();
//    }
//    
//    public int top() {
//        int temp = 0;
//        if(!stk.isEmpty()){
//       		temp = (Integer) stk.pop();
//    		stk.push(temp);
//        }else{
//            return -1;
//        }
//        return temp;
//    }
//    
//    public int min() {
//        
//        int min = Integer.MAX_VALUE;
//        
//        while(!stk.isEmpty()){
//        	int temp = (Integer) stk.pop();
//            if(temp<min)
//                min = temp;
//        }
//        
//        return min;
//    }
    
	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Soltuion s = new Soltuion();
//		s.push(3);
//		int res =s.min();
//		System.out.println(res);
//	}

}

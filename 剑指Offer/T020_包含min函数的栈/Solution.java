package T020_包含min函数的栈;

import java.util.Stack;

public class Solution {
	
	Stack stk = new Stack();
    Stack stk1 = new Stack();
    public void push(int node) {
        stk.push(node);
    }
    
    public void pop() {
        if(!stk.isEmpty())
       		stk.pop();
    }
    
    public int top() {
        int temp = 0;
        if(!stk.isEmpty()){
       		temp = (Integer) stk.pop();
    		stk.push(temp);
        }else{
            return -1;
        }
        return temp;
    }
    
    public int min() {
        
        int min = Integer.MAX_VALUE;
        
        while(!stk.isEmpty()){
        	int temp = (Integer) stk.pop();
            stk1.push(temp);
            if(temp<min)
                min = temp;
        }
        while(!stk1.isEmpty()){
        	int temp = (Integer) stk1.pop();
            stk.push(temp);
           
        }
        return min;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package T232_ImplementQueueUsingStacks;

import java.util.Stack;

public class MyQueue {
	
	Stack stack = new Stack();
	Stack stack1 = new Stack();
	
	
    // Push element x to the back of queue.
    public void push(int x) {
    	if(stack.size() < stack.capacity())
    		stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
    	int length = stack.size();
    	
    	for(int i = 0 ; i < length ; i++ )
    		stack1.push(stack.pop());
    	for(int i = 0 ; i < length-1; i++)
    		stack.push(stack1.pop());
    }

    // Get the front element.
    public int peek() {
    	
    	return (Integer) stack.get(0);
        
    }

    // Return whether the queue is empty.
    public boolean empty() {
		
    	if(stack.empty())
    		return true;
    	else
    		return false;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

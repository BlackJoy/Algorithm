package T20_ValidParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack stk = new Stack();
        
        for(int i = 0 ; i < s.length() ; i ++){
        	
        	if( s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
        		stk.push(s.charAt(i));
        	else if( s.charAt(i) == ')' && !stk.empty() && stk.peek().equals('(')  )
        		stk.pop();
        	else if( s.charAt(i) == ']' && !stk.empty() && stk.peek().equals('[')  )
        		stk.pop();
        	else if( s.charAt(i) == '}' && !stk.empty() && stk.peek().equals('{')  )
        		stk.pop();
        	else
        		return false;
        }
        
        return stk.isEmpty();
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		boolean res = s.isValid("()[]{}");
		System.out.println(res);
	}

}

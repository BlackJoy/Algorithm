package T9;

public class Solution {
	
	
	
    public boolean isPalindrome(int x) {
    	
    	
    	
    	
    	
    	if(x<0)
    		return false;
    	else{
    		int temp =Integer.reverse(x); 
    		return  x == (Integer.reverse(x));
    	}
    	

    }	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		boolean res = s.isPalindrome(1707227071);
		System.out.println(res);
	}

}

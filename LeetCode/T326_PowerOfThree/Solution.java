package T326_PowerOfThree;

public class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(n<=0) return false;
        if(n==1) return true;
        
        
        
    	while(n!=0){
    		
    		if(n/3==0) {
    			if(n%3!=1)
    				
    					return false;
    			else
    					return true;
    		}else{
    			if(n%3==0)
    				n/=3;
    			else
    				return false;
    		}
    		
    	}
    	
    	return true;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		boolean res = s.isPowerOfThree(27);
		System.out.println(res);
	}

}

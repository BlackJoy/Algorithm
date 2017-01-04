package T38_CountAndSay;

public class Solution {
    public String countAndSay(int n) {
        
    	StringBuilder sb = new StringBuilder();
    	while(n!=0){
    		sb.append(n%10);
    		n/=10;
    	}
    	String temp = sb.reverse().toString();
    	sb = new StringBuilder(); 
    	char index = temp.charAt(0);
    	int num = 0 ;
    	for(int i = 0 ; i < temp.length() ; i ++){
    		if(temp.charAt(i)==index )
    			num++;
    		else{
    			sb.append(num+""+index);
    			index = temp.charAt(i);
    			num = 1; 
    		}
    			
    	}
    	sb.append(num+""+index);
    	return sb.toString();
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String res = s.countAndSay(21);
		System.out.println(res);
	}

}

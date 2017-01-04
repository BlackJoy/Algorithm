package T299_BullsAndCows;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String getHint(String secret, String guess) {
        
    	int A = 0;
    	int B = 0;

    	Map map = new HashMap();
    	
    	for(int i = 0 ; i < secret.length() ; i ++){
    		if(map.get(secret.charAt(i)) == null )
    			map.put(secret.charAt(i), 1);
    		else{
    			
    			int val = (Integer) map.get(secret.charAt(i));
    			map.put(secret.charAt(i), ++val  );
    	
    		}
    	}
    	for(int i = 0 ; i < guess.length() ; i ++){
    		if(guess.charAt(i)==secret.charAt(i)){
    			A++;
    			int val =  (Integer) map.get(guess.charAt(i));
    			map.put(guess.charAt(i),--val);
    		}
    		else if( secret.indexOf( guess.charAt(i)  )!=-1){
    			int val = (Integer) map.get(guess.charAt(i) );
    			if( val!= 0){
    				map.put(guess.charAt(i), --val);
    				B++;
    			}
    			
    		}
    	}
        
    	String res = A+"A"+B+"B";
    	return res;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String res = s.getHint("1122", "1222");
		System.out.println(res);
	}

}

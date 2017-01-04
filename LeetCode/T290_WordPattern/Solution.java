package T290_WordPattern;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
    public boolean wordPattern(String pattern, String str) {
        
    	String arr[] = str.split(" ");
    	
    	if(arr.length != pattern.length()) 
    		return false;
    	
    	Map map = new HashMap();
    	
    	for(int i = 0; i < arr.length ; i ++){
    		
    		char c = pattern.charAt(i);
    		if(map.containsKey(c)){
    			if( !map.get(c).equals(arr[i]) )
    				return false; 
    		}else{
    			if(map.containsValue(arr[i]))
    				return false;
    			map.put(c, arr[i]);
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
		boolean flag = s.wordPattern("abba", "dog cat cat dog");
		System.out.println(flag);
	}

}

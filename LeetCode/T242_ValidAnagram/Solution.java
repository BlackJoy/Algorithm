package T242_ValidAnagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
    public boolean isAnagram(String s, String t) {
        
    	char[] s_arr = s.toCharArray();
    	char[] t_arr = t.toCharArray();
    	
    	if(s_arr.length>t_arr.length) return false;
    	
    	Map map = new HashMap();
    	for(int i = 0 ; i<s_arr.length ;i++){
    		if( map.get(s_arr[i]) == null ){
    			map.put(s_arr[i], 1);
    		}else{
    			int val = (Integer) map.get(s_arr[i]);
    			val+=1;
    			map.put(s_arr[i], val);
    		}
    	}
    	
    	
    	for(int i = 0 ; i< t_arr.length ; i++){
    		if( map.get(t_arr[i])==null )
    			return false;
    		else{
    			int val = (Integer) map.get(t_arr[i]);
    			val-=1;
    			if(val<0) return false;
    			else
    				map.put(t_arr[i], val);
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
		
		System.out.println(s.isAnagram("anagram", "nagaram"));
	}

}

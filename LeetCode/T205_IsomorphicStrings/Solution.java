package T205_IsomorphicStrings;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
    public boolean isIsomorphic(String s, String t) {
        
    	if(s.length()!=t.length()) return false;
    	
    	Map map1 = new HashMap<Character,Integer>();
    	Map map2 = new HashMap<Character,Integer>();
    	int arr1[] = new int[s.length()];
    	int arr2[] = new int[t.length()];
    	for(int i = 0 ; i < s.length() ; i ++){
    		if( map1.get(s.charAt(i))== null){
    			arr1[i] = i;
    			map1.put(s.charAt(i), i);
    		}
    		else
    			arr1[i] = (Integer) map1.get(s.charAt(i));
    		
    		if( map2.get(t.charAt(i))== null){
    			arr2[i] = i;
    			map2.put(t.charAt(i), i);
    		}
    		else
    			arr2[i] = (Integer) map2.get(t.charAt(i));
    	}
    	
    	
    	for(int i = 0 ; i < arr1.length ; i++){
    		if(arr1[i]!=arr2[i]) return false;	
    	}
    	return true;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		boolean flag = s.isIsomorphic("", "");
		System.out.println(flag);
	}

}

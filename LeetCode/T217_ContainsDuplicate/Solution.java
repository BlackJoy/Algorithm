package T217_ContainsDuplicate;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
    public boolean containsDuplicate(int[] nums) {
        
    	if(nums==null || nums.length==0) return false;
    	
    	Map map = new HashMap();
    	
    	for(int i = 0 ; i < nums.length ; i++){
    		if(map.get(nums[i]) == null){
    			map.put(nums[i], 1);
    		}else if(map.get(nums[i]) == Integer.valueOf(1)){
    			return false;
    		}
    		
    	}
    	
    	return true;
    }
	
	
	public static void main(String[] args){
		Solution s = new Solution();
		int[] temp = new int[]{0};
		
		System.out.println(s.containsDuplicate(temp));
	}
}

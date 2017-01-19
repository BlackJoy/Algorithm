package T050_数组中重复的数字;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean duplicate(int numbers[],int length,int [] duplication) {
    	
        
        Map map = new HashMap();
    	for(int i = 0 ; i < length ; i++){
    		if(map.get(numbers[i])==null){
    			map.put(numbers[i], 1);
    		}else{
    			duplication[0]=numbers[i];
    			return true;
    		}
    	}
        
    	return false;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

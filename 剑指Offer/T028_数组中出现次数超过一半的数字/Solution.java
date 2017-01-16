package T028_数组中出现次数超过一半的数字;

import java.util.HashMap;
import java.util.Map;

public class Solution{
	
    public int MoreThanHalfNum_Solution(int [] array) {
        Map map = new HashMap();
    	int key = 0;
    	int max = 0;
    	for(int i = 0;i<array.length ; i++){
    		if(map.get(array[i])==null){
    			map.put(array[i], Integer.valueOf(1));
    			if(1>max) {max = 1; key = array[i]; }
    		}else{
    			int num = (Integer) map.get(array[i]);
    			map.put(array[i], Integer.valueOf(++num));
    			if(num>max){ max = num; key = array[i];}
    		}
    	}
    	if(max> (array.length/2) ) return key;
    	else return 0;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

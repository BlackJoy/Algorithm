package T040_数组中只出现一次的数字;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Solution {
	
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        
        Map map  = new HashMap();
        
        for(int i = 0 ; i < array.length ;i ++){
            if( (Integer)map.get(array[i])==null)
                map.put(array[i],1);
            else{
                int val = (Integer)map.get(array[i]);
                map.put(array[i],val+1);
            }
        }
        
        Set set = map.keySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            int key = (Integer)it.next();
			int val = (Integer)map.get(key);
            if(val==1 && num1[0]==0){
                num1[0] = key;
            }else if(val==1){
                num2[0] = key;
            }
            
        }
        System.out.println("res");
    }
	
	public static void main(String[] args){
		Solution s = new Solution();
		s.FindNumsAppearOnce(new int [] {2,4,3,6,3,2,5,5}, new int[1], new int [1]);
	}
	
}

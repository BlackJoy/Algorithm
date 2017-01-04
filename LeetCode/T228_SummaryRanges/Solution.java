package T228_SummaryRanges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
    public List<String> summaryRanges(int[] nums) {
    	List ls = new ArrayList();
    	if(nums==null) return null;
    	if(nums.length==1) {
    		ls.add(nums[0]+"");
    	}
    	
        int i = 0 ; 
        int j = 0 ;
        
        String temp = "";
        
        for(int k = 1 ; k < nums.length ; k++){
            
            if(nums[k] - nums[i] == k-i){
               nums[k] = -1;
            }
            
        }
        
        return ls;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution ();
		s.summaryRanges(new int[]{0,1,2,4,5,7});
	}

}

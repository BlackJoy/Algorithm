package T414_ThirdMaximumNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	 public int thirdMax(int[] nums) {
	        
	        if(nums == null || nums.length==0) return 0;
	        if(nums.length<3) {
	            int max = Integer.MIN_VALUE;
	            for(int i = 0 ; i < nums.length ;i++){
	                if(nums[i]>max)
	                    max = nums[i];
	            }
	            return max;
	        }
	        Arrays.sort(nums);
	        List ls = new ArrayList();
	        int temp = nums[0];
	        ls.add(nums[0]);
	        for(int i = 1 ; i < nums.length ;i++){
	        	if(nums[i]!=temp){
	        		ls.add(nums[i]);
	        		temp = nums[i];
	        	}else
	        		continue;
	        }
	        
	        if(ls.size() < 3)
	        	return (Integer) ls.get(ls.size()-1);
	        else 
	        	return (Integer) ls.get(ls.size()-3);
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.thirdMax(new int[]{3,2,1});
	}

}

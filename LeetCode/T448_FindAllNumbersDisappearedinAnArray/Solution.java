package T448_FindAllNumbersDisappearedinAnArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int n [] = new int[nums.length+1];
        
        for(int i = 0 ; i < nums.length ; i ++){
            n[nums[i]]++;
        }
        
        List<Integer> ls = new ArrayList<Integer>();
        for(int i = 1 ; i < n.length;i++){
            if(n[i]==0)
                ls.add(i);
        }
        
        return ls;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
	}

}

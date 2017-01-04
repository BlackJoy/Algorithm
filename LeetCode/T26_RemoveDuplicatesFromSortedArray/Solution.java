package T26_RemoveDuplicatesFromSortedArray;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        
        if(nums.length==0) return  0;
        
        for(int i = 1 ; i < nums.length ; i++){
        	if(nums[i]!=nums[index]){
        		index++;
        		nums[index] = nums[i];
        	}
        		
        }
        return index+1;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = new int[]{1,1,2};
		Solution s = new Solution();
		s.removeDuplicates(nums);
	}

}

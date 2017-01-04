package T283_MoveZeros;

public class Solution {
	
    public void moveZeroes(int[] nums) {
        int j = 0;
        int index = 0;
    	for(int i = 0 ; i < nums.length ;i++){
        	if(nums[i]!=0)
        		nums[j++] = nums[i];
        }
    	
    	index = j ;
    	for(int i = index ; i <nums.length ;i++){
    		nums[i]=0;
    	}
    	
    	
    	System.out.println(nums);
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] nums = new int[]{0, 0,1};
		s.moveZeroes(nums);
	}

}

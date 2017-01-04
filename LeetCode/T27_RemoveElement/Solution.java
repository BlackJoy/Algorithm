package T27_RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
     
    	int length = 0;
    		
    	for(int i = 0 ; i < nums.length ; i++){
    		if(nums[i]!=val)
    			length++;
    	}
    	return length;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package T303_RangeSumQuery_Immutable;

public class NumArray {
	
	private int[] temp ;
	
    public NumArray(int[] nums) {
        
    	if(nums == null || nums.length == 0) return;
    	
    	temp = new int[nums.length+1];
    	for(int i = 0 ; i< nums.length ;i ++){
    		temp[i+1] = temp[i]+nums[i];
    	}
    }

    public int sumRange(int i, int j) {
        
    	return temp[j+1] - temp[i];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

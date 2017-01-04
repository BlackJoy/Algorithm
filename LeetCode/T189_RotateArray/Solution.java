package T189_RotateArray;

public class Solution {
    public void rotate(int[] nums, int k) {
        
        int arr[] = new int[nums.length];
        
        
        for(int i = 0 ; i < nums.length ;i ++){
            int index = (i+k)%nums.length;
            arr[index] = nums[i];
        }
        
        for(int i = 0 ; i < nums.length ;i++){
        	nums[i] = arr[i];
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.rotate(new int[]{1,2}, 1);
	}

}

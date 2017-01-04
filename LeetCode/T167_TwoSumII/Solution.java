package T167_TwoSumII;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
    	int index1=0;
    	int index2=0;
    	
    	for(int i = 0 ; i<numbers.length ;i++){
    		if(numbers[i]<target){
    			for(int j = i+1; j<numbers.length ;j++)
    				if(numbers[i]+numbers[j]==target){
    					index1 = i;
    					index2 = j;
    				}
    		}
    	}
    	
    
    	return new int[]{index1+1,index2+1};
    	
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		
		s.twoSum(new int[]{2,3,4}, 6);
	}

}

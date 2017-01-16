package T030_连续子数组的最大和;

public class Solution {
	
    public int FindGreatestSumOfSubArray(int[] array) {
     	int max = array[0] ; 
        
        for(int i = 1 ; i<array.length; i++){
            
            array[i] = Math.max( array[i],array[i]+array[i-1] );
            
            if(array[i]>max)
                max = array[i];
        }
        return max;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package T396_RotateFunction;

public class Solution {
	
    public int maxRotateFunction(int[] A) {
        
    	int B[] = A;
    	int max = Integer.MIN_VALUE;
    	for(int i = 0 ; i < A.length ;i++){
    		int sum = 0;
    		for(int j = 0 ; j < A.length ;j++){
    			sum += B[(j+i)%A.length] * j;
    		}
    		if(sum>max) max = sum;
    	}
    	
    	return max;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int res = s.maxRotateFunction(new int[]{-2147483648,-2147483648});
		System.out.println(res);
	}

}

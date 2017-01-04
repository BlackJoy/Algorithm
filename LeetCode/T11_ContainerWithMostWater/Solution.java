package T11_ContainerWithMostWater;

public class Solution {
	
    public int maxArea(int[] height) {
    	
    	int i = 0;
    	int j = height.length-1;
    	int max = 0;
    	
    	while(i!=j){
    		
    		if(height[i]<=height[j]){
    			if(height[i]*(j-i)>max)
    				max = height[i]*(j-i);
    			i++;
    		}else{
    			if(height[j]*(j-i)>max)
    				max = height[j]*(j-i);
    			j--;
    		}
    		
    	}
    	
    	return max;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.maxArea(new int[]{1,2,3,4}));
	}

}

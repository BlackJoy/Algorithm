package T84_LargestRectangleinHistogram;

import java.util.Stack;

public class Solution {
	
    public int largestRectangleArea(int[] heights) {
    	
    	
    	int maxArea = 0 ;
    	int min = Integer.MAX_VALUE;
    	if (heights.length == 0) return 0;
    	if (heights.length == 1) return heights[0];

    	for(int i = 0 ;i < heights.length ; i++ ){
    		for(int j = 0 ; j < heights.length ; j++){
    			
    			min = Integer.MAX_VALUE;
    			if(i==j) min = heights[i];
    			
    			for(int k = i ; k <=j ; k++)
    				if(heights[k]<min)
    					min = heights[k];
    			int area = 0;
    			if(i<=j)
    			area = ( j-i+1)*min;
    			
    			if(area > maxArea) maxArea = area;
    			
    			
    		}
    	}
    	
    	return maxArea;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int res = s.largestRectangleArea(new int[]{
			0,1,0,1
		});
		System.out.println(res);
	}

}

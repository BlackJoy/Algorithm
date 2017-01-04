package T11;

public class Solution {
	
	public int find_min(int i , int j , int[] height){
		int min = Integer.MAX_VALUE;
		for(int k = i ; k <= j;k++){
			if(height[k]<min) min = height[k];
		}
		return min;
	}
	
    public int maxArea(int[] height) {
        int max = 0;
        
        for(int i = 0 ; i< height.length ;i++){
        	for(int j=i ; j < height.length ;j++){
        		
        		int min = find_min(i,j,height);
        		if( min * ((j-i)) > max ){
        			max = min * ((j-i));
        		}
        	}
        }
        return max;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int [] height = {1,1};
		int res = s.maxArea(height);
		System.out.println(res);
	}

}

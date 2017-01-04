package T274_H_Index;

import java.util.Arrays;

public class Solution {
	
	
    public int hIndex(int[] citations) {
        
    	int h = 0;
    	
    	if(citations.length==0) return  h;
    
    	Arrays.sort(citations);
        for(int i = citations.length-1; i >=0  ; i--){
        	if(citations[i]>= citations.length - i )
        		h = citations.length - i;
        }
        
        return h;
    }
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int res = s.hIndex(new int[]{1});
		System.out.println(res);
	}

}

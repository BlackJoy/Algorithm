package T064_滑动窗口的最大值;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        if(size>num.length || size<=0) return res;
        
        for(int i = 0 ; i <= num.length-size;i++){
            int max = Integer.MIN_VALUE ;
            for(int j = i ; j < i+size;j++ ){
                if(num[j]>max)
                    max = num[j];
            }
            res.add(max);
            
        }
        
        return res;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.maxInWindows(new int[]{
				
				2,3,4,2,6,2,5,1	
		}, 3);
	}

}

package T041_和为S的连续正数序列;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
   public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        
        ArrayList res = new ArrayList();
        ArrayList ls = new ArrayList();
        
        if(sum<3) return res;
        
        int small = 1;
        int big = 2;
        int middle = (1+sum)/2;
        int curSum = small + big;
        
        while(small<middle){
            
            if(curSum == sum && small!=big){
            	ls = new ArrayList();
                for(int i = small;i<=big ;i++)
                    ls.add(i);
                res.add(ls);
            }

            while(curSum>sum){
                curSum-=small;
                small++;
                if(curSum == sum && small != big){
                	ls = new ArrayList();
                	for(int i = small;i<=big ;i++)
                    	ls.add(i);
                    res.add(ls);
                }
            }
            
            big++;
            curSum+=big;
        }
        
        //Collections.sort(res,new MyComparator());
        
        return res;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.FindContinuousSequence(3);
	}
	

}

package T046_圆圈中最后剩下的数;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
	   public int LastRemaining_Solution(int n, int m) {
	        
	        if(n<1 || m<1) return -1;
	        
	        int arr[] = new int[n];
	        
	        int count = n;
	        
	        int i = -1 , step = 0 ;
	        while(count>0){
	            
	            i++;
	            if(i>=n) i =0; //到尾部
	            if(arr[i]==-1) continue;  //已经出环的跳过
	            step++;
	            if(step==m){
	                count--;
	             	step = 0;
	                arr[i] = -1;
	            }
	            
	        }
	        return i;
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

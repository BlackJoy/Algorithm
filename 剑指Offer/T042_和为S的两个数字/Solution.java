package T042_和为S的两个数字;

import java.util.ArrayList;

public class Solution {
	/**
	 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
	 * @param array
	 * @param sum
	 * @return
	 */
	
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
    	
    	if(array.length <= 1) return ls;
    	
    	int index = 0;
    	for(int i = 0 ; i < array.length ;i++)
    		if(array[i]<sum)
    			index++;
    	
    	int arr [][] = new int [index][2];
    	
    	int count = 0 ;
    	
        int ahead = array.length - 1;
        int bhead = 0 ;
        
        while(ahead>bhead){
        	long curSum = array[ahead] + array[bhead];
            if(curSum==sum){
                arr[count][0] = array[bhead];
                arr[count][1] = array[ahead];
                count++;
                ahead--;
            }else if(curSum > sum){
                ahead--;
            }else{
                bhead++;
            }
        }

        
    	int min = Integer.MAX_VALUE ;
    	index = 0 ;
    	for(int i = 0 ; i<count;i++){
    		if(arr[i][0]*arr[i][1]<min){
    			min = arr[i][0]*arr[i][1];
    			index = i;
    		}
    	}
    	
    	if(min!=Integer.MAX_VALUE){
    	ls.add(arr[index][0]);
    	ls.add(arr[index][1]);
    	}
    	return ls;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.FindNumbersWithSum(new int[]{
			1,2,4,7,11,15
		}, 15);
	}

}

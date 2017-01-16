package T029_最小K个数;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        if(k>input.length || k==0) 
        	return ls;
       
        int arr[]=new int[k];
        for(int i = 0 ; i<input.length;i++){
            if(i<k)
                arr[i]=input[i];
            else{
                
                //找到容量为k的数组的最大值
                int max = arr[0] ;
                int index = 0;
                for(int j = 1 ; j < k ;j++){
                    if(arr[j]>max){
                        max = arr[j];
                        index = j;
                    }
                }
                //如果当前值比数组K的最大值小，将数组K中的最大值替换
                if(input[i]<max)
                    arr[index] = input[i];
            }
        }
        
        Arrays.sort(arr);
        for(int i = 0 ; i < k ; i++)
            ls.add(arr[i]);
        return ls;
            
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

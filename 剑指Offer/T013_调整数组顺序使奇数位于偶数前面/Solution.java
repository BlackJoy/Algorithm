package T013_调整数组顺序使奇数位于偶数前面;

public class Solution {
	
    public void reOrderArray(int [] array) {
        int []arr1 = new int [array.length]; 
        int []arr2 = new int [array.length];
        
        int index1 = 0 ;
        int index2 = 0 ;
        
        for(int i = 0 ; i <array.length ; i ++){
            
            if(array[i]%2 ==0) 
                arr2[index2++] = array[i];
            else
                arr1[index1++] = array[i];
        }
        
        int  i = 0;
        for(i = 0 ; i <index1 ;i ++){
            array[i] = arr1[i];
        }
        
        for(  ; i < array.length ; i ++){
            array[i] = arr2[i-index1];
        }
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

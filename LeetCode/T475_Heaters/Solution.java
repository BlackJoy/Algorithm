package T475_Heaters;

public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        
    	if(heaters==null || heaters.length==0) return 0;
    	if( heaters[heaters.length-1] > houses.length) return  0;
    	
    	int arr[] = new int[houses.length];
    	int i = 1;
    	for( ; i < houses.length ;i ++ ){
    		arr = new int[houses.length];
    		
    		for(int j = 0 ; j < heaters.length ; j++){
    			int temp = heaters[j];
    			for(int k = temp-1 ; k >= temp - i-1 && k >= 0; k--)
    				arr[k] = 1;
    			for(int k = temp-1 ; k <= temp + i-1 && k < arr.length; k++)
    				arr[k] = 1;
    		}
    		int k = 0;
    		for(k = 0 ; k < arr.length ; k++){
    			if(arr[k]==0)
    				break;
    		}
    		if(k>=arr.length ) return i;
    	}
    	
    	return 0;
    	
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int res = s.findRadius(new int[]{1,2,3,4}, new int[]{1,4});
		System.out.println(res);
	}

}

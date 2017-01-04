package T376_WiggleSubsequence;

public class Solution {
    public int wiggleMaxLength(int[] nums) {
    	if(nums.length<1) return 0;
        if(nums.length==1) return 1;
        
        int[] arr = new int[nums.length-1];
    	
    	for(int i = 1 ; i < nums.length ; i++){
    		arr[i-1] = nums[i]-nums[i-1];
    	}
    	
    	int max = 1;
    	int flag = -1;
    	
    	for(int i = 0 ; i < arr.length;i++){
    		int temp = 1;
    		if(arr[i]>0){
    		    temp++;
    		    if(temp+1>max) max = temp;
    			for(int j = i+1 ; j<arr.length ;j++){
    				if( arr[j]<0 && flag < 0 ){
    					if(temp+1>max) max = temp++ +1;
    					flag = 1; 
    					continue;
    				}
    				if( arr[j]>0 && flag > 0 ){
    					if(temp+1>max) max = temp++ +1;
    					flag = -1; 
    					continue;
    				}
    			}
    		}
    		if(arr[i]<0){
    		    temp++;
    		    if(temp+1>max) max = temp;
    			flag = 1;
    			for(int j = i+1 ; j<arr.length ;j++){
    				if( arr[j]<0 && flag < 0 ){
    					if(temp+1>max) max = temp++ +1;
    					flag = 1; 
    					continue;
    				}
    				if( arr[j]>0 && flag > 0 ){
    					if(temp+1>max) max = temp++ +1;
    					flag = -1; 
    					continue;
    				}
    			}
    		}
    		
    	}
    	
    	return max;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int res = s.wiggleMaxLength(new int[]{1,7,4,9,2,5});
		System.out.println(res);
	}

}

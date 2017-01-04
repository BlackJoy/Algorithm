package T190_ReverseBits;

public class Solution {
    // you need treat n as an unsigned value
	
	
	public int reverseBits(int n) {
		
		String temp = Integer.toBinaryString(n);
		String num_32 = temp;
		if(temp.length()<32) 
			for(int i = 0 ; i <  (32-temp.length()) ; i++){
				num_32 = '0'+ num_32;
			}
		
		StringBuilder sb = new StringBuilder(num_32);
		
		temp = sb.reverse().toString();
		
		char []  char_arr =  temp.toCharArray();
		
	    int sum = 0;
	    int j = 0 ;
	    for(int i =31 ; i >=0;i--){
	    	if(char_arr[i]=='1')
	    		sum+=Math.pow(2, j);
	    	j++;
	    }
	    return sum;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s= new Solution();
		int res = s.reverseBits( 43261596 );
		System.out.println(res);
	}	

}

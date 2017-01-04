package Num6_ZigzagConversion;

public class Solution {
	
	StringBuilder sb = new StringBuilder();
	public void add(int i ,String s , int numRows){
		char [] arr=s.toCharArray();
		
		int j = 0;
		
		if(i==0){
			for(j=0;j<arr.length;j++){
				if(j%((numRows-1)*2) == 0)
					sb.append(arr[j]);
				continue;
			}
		}
		else{
			for(j=1;j<arr.length;j++){
				if(j%((numRows-1)*2)==i || j%((numRows-1)*2-i) == 0)
					sb.append(arr[j]);
				continue;
			}
		}
    	
		
	}
	
	public String convert(String s, int numRows) {
	    
		char [] arr=s.toCharArray();

        for(int i = 0 ; i < numRows;i++){
        	add(i,s,numRows);       	
        }
 
        return sb.toString();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String res = s.convert("PAYPALISHIRING",3);
		System.out.println(res);
		
		//PAHNAPLIINGYAIHRN
		//PAHNAPLSIIGYIR	
		//PAHNAPLSIIGYIR
				
	}

}

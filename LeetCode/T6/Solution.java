package T6;

public class Solution {

	private StringBuilder sb = new StringBuilder();
	
	public String convert(String s, int numRows) {
        
		if(numRows == 1) return s;
		
		char arr[] = s.toCharArray();
		for(int i = 0 ; i < numRows; i++){
			for(int j = 0 ; j< arr.length ;j++){
				if( j %( (numRows-1)*2 )== i || j %( (numRows-1)*2 )== ((numRows-1)*2 -i) ){
					sb.append(arr[j]);
				}else{
					continue;
				}
			}
		}
		
		return sb.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String res = s.convert("A", 1);
		System.out.println(res);
	}
    //PAHNAPLSIIGYIR
	//PAHNAPLSIIGYIR
}

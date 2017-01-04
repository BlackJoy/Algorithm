package T168_ExcelSheetColumn;

public class Solution {
    public String convertToTitle(int n) {
    	String res = "";
        
        while(n!=0){
        	char ch = (char)((n - 1) % 26 + 65);
        	
            res = (char)((n-1)%26+65) + res;
            n = (n-1)/26;
        }
        
        return res;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.convertToTitle(28);
	}

}

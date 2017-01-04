package T5_LongestPalindromicSubstring;

public class Solution {

	public String longestPalindrome(String s) {
		
		int len = 0;
		
		String res = "" ;
		
		String temp = s;
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i <  s.length() ; i ++ ){
			for(int j = 0 ; j < s.length() ;j++){
				temp = s.substring(i, j+1);
				sb.append(temp);
				String rev = sb.reverse().toString();
				if(rev == temp && rev.length()>len)
					res = rev;
					
			}
		}
		
		return res;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s  = new Solution();
		s.longestPalindrome("babad");
	}

}

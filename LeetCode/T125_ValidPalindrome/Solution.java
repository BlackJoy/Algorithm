package T125_ValidPalindrome;

public class Solution {
    
	public boolean isPalindrome(String s) {
		char [] arr = s.toCharArray();
		String temp = "";
		for(int i = 0 ; i < arr.length ; i ++){
			if(arr[i]>='a' && arr[i]<='z')
				temp+= (char)(arr[i]);
			if(arr[i]>='A' && arr[i]<='Z')
				temp+= (char)('a'+arr[i]-'A');
			if(arr[i]>='0' && arr[i]<='9')
			    temp+= (char)(arr[i]-'0');
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(temp);
		String res = sb.reverse().toString();
		
		return temp.equals(res);
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		boolean flag = s.isPalindrome("0P");
		System.out.println(flag);
	}

}

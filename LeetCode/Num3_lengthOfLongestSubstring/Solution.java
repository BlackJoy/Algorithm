package Num3_lengthOfLongestSubstring;

public class Solution {

	//最长公共子串长度
	public int lengthOfLongestSubstring(String s) {
		int max = 0;
		String temp = "";
		if(s==null || s.equals("")){
			return 0;
		}else{
			char[] arr = s.toCharArray();
			
			
			int length = 0;
			
			for(int i = 0 ;i < arr.length ;i++){
				if(temp.indexOf(arr[i])==-1){
					temp+=arr[i];
					length++;	
				}else{
					int index = temp.indexOf(arr[i]);
					temp = ""+temp.substring(index+1,temp.length())+arr[i];
					length = temp.length();
				}
				if(length>max)
					max = length;
			}
		}
		System.out.println(temp);
		System.out.println(max);
		return max;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
	    s.lengthOfLongestSubstring("abcabcbb");
	}

}

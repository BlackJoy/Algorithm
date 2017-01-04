package T58_LengthofLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        
        if(s==null || s.length() ==0 || s.equals(" ")) return 0;
        
        String arr[] = s.split(" ");
        if(arr.length>0)
        	if(arr[arr.length-1]=="")
        		return 0;
        	else
        		return arr[arr.length-1].length();
        else
        	return 0;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.lengthOfLastWord("       ");
	}

}

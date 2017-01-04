package T344_ReverseString;


public class Solution {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s= new Solution();
		String res = s.reverseString("hello");
		System.out.println(res);
	}

}

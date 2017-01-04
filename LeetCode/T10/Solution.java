package T10;

public class Solution {

    public boolean isMatch(String s, String p) {
        
    	return s.matches(p);
    	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		boolean flag = s.isMatch("aab", "c*a*b");
		System.out.println(flag);
	}

}

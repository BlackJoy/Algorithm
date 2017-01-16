package T002_替换空格;

public class Solution {
	
    public String replaceSpace(StringBuffer str) {
    	return str.toString().replaceAll(" ", "%20");
    }	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String res = s.replaceSpace(new StringBuffer("We Are Happy.") );
		System.out.println(res);
	}

}

package T043_左旋转字符串;

public class Solution {
    public String LeftRotateString(String str,int n) {
        String front = "";
        
        if(str==null || str.length()==0) return "";
        if(n<=0) return str;
        
        for(int i = 0 ; i < n ;i++){
            front+=str.charAt(i);
        }
        
        return str.substring(n,str.length())+front;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String res = s.LeftRotateString("abcXYZdef", 3);
		System.out.println(res);
	}

}

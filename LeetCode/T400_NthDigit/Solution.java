package T400_NthDigit;

public class Solution {
	
    public int findNthDigit(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i <= n;i++)
            sb.append(i);
          
        
        return sb.charAt(n-1)-'0';
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int res = s.findNthDigit(10000000);
		System.out.println(res);
	}

}

package T011_二进制中1的个数;

public class Solution {
    public int NumberOf1(int n) {
        
        int count  = 0 ;
        while(n!=0){
            ++count;
            n = (n-1) & n;
        }
        return count;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
